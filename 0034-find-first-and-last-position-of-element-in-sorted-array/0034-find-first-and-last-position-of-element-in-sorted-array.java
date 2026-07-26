class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0, r=n-1;
        if(n==0) return new int[]{-1,-1};

        int frist=-1; int last=-1;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                frist=i;
                break;
            }
        }

        if(frist==-1) return new int[]{-1,-1};

        for(int j=n-1; j>=0; j--){
            if(nums[j]==target){
                last=j;
                break;
            }
        }

        return new int[]{frist, last};
    }
}