class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int num:nums){
            if(num < k){
                count++;
            }
        }
        return count;
    }
}