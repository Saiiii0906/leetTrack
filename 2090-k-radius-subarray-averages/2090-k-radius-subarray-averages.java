class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        Arrays.fill(avgs, -1);

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long size = 2L * k + 1;
        for (int i = k; i < n - k; i++) {
            long sum = prefix[i + k + 1] - prefix[i - k];
            avgs[i] = (int) (sum / size);
        }

        return avgs;
    }
}