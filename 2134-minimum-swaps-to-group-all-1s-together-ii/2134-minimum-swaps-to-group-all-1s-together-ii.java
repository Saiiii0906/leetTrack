class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        int k = Arrays.stream(nums).sum();

        for(int i=0; i<k; i++){
            count += nums[i];
        }
        int max = count;

        for(int i=k; i<n+k; i++){
            count += nums[i%n] - nums[(i-k+n)%n];
            max = Math.max(max, count);
        }

        return k-max;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[i + 1];
        //         nums[i + 1] = temp;
        //         count++;
        //     }
        // }
        
    }
}