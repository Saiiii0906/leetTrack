class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007;

        Arrays.sort(nums);

        int[] power = new int[nums.length];
        power[0]=1;
        for(int k=1; k<nums.length; k++){
            power[k] = (power[k-1]*2) % mod;
        }

        int i=0;
        int j=nums.length-1;
        int count=0;

        while(i<=j){
            if(nums[i]+nums[j]<=target){
                count = (count + power[j-i])%mod;
                i++;
            }else{
                j--;
            }
        }

        return count;
    }
}