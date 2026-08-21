class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0, maxSum=0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        maxSum = sum;
        for(int i=k; i<n; i++){
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum/k;
    }
}