class Solution {
    public boolean minLargeSum(int m,int k,int[] nums){
        int count=1;
        int sum=0;
        for(int num:nums){
            if((sum+num)>m){
                count++;
                sum = num;
            }else{
                sum+=num;
            }
        }
        return count<=k;
    }

    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int l=Integer.MIN_VALUE; int r=0;
        int ans=0;
        if(n<k) return 0;
        for(int num:nums){
            l=Math.max(l,num);
            r+=num;
        }

        while(l<=r){
            int m=l+(r-l)/2;
            if(minLargeSum(m,k,nums)){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }

        return ans;
    }
}