/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int l=0, r=n-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }else{
                r=mid;
            }
        }

        int peak = l;
        int ans = binarySearch(mountainArr, target, 0, peak, true);
        if(ans!=-1) return ans;

        return binarySearch(mountainArr, target, peak, n-1, false); 
    }

    public int binarySearch(MountainArray array, int target, int l, int r, boolean val){
        while(l<=r){
            int mid = l+(r-l)/2;
            int value = array.get(mid);

            if(value == target) return mid;
            if(val){
                if(value<target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }else{
                if(value>target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}