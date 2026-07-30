class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=0, sum=0;
        int n=nums.length;
        int l=1, r=nums[0];

        for(int m:nums){
            r=Math.max(r,m);
        }

        while(l<=r){
            int mid=l+(r-l)/2;
            sum=0;
            for(int m:nums){
                sum+=(m+mid-1)/mid;
            }

            if(sum<=threshold){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;
    }
}