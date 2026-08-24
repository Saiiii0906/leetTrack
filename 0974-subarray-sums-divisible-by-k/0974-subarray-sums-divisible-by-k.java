class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int[] counts = new int[k];
        counts[0] = 1;
        int prefix=0;
        int res=0;
        
        for(int num:nums){
            prefix += num;
            int rem = (prefix % k+k)%k;
            res += counts[rem];
            counts[rem]++;
        }
        return res;
    }
}