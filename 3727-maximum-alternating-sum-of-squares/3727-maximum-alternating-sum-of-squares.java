class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] nums2 = new long[n];
        for(int i=0; i<n; i++){
            nums2[i] = (long) nums[i] *nums[i];
        }

        Arrays.sort(nums2);
        long ans = 0;
        int k = nums.length/2;

        for(int i=0; i<k; i++){
            ans -= nums2[i];
        }

        for(int i=k; i<nums.length; i++){
            ans += nums2[i];
        }

        return ans;
    }
}