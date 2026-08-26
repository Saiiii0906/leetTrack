class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        long maxSum = 0;
        Set<Integer> res = new HashSet<>();

        int l = 0;
        for (int r = 0; r < n; r++) {
            while (res.contains(nums[r])) {
                res.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            res.add(nums[r]);
            sum += nums[r];

            if (r - l + 1 > k) {
                res.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}