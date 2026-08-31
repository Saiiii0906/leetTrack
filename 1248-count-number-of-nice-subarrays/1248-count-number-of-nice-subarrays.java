class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum=0;
        int res=0;
        
        int[] count = new int[nums.length+1];
        count[0]=1;

        for(int num:nums){
            sum+=(num%2!=0)? 1:0;
            if(sum>=k){
                res+=count[sum-k];
            }
            count[sum]++;
        }
        return res;
    }
}