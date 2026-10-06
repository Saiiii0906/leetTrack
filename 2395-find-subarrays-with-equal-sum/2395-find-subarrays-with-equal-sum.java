class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sum = new HashSet<>();
        for(int i=0; i<nums.length-1; i++){
            int currSum = nums[i] + nums[i+1];

            if(sum.contains(currSum)) return true;

            sum.add(currSum);
        }

        return false;
    }
}