class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;

        Deque<Integer> q = new ArrayDeque<>();
        int l=0;

        for(int r=0; r<n; r++){
            while(!q.isEmpty() && nums[q.peekLast()]<nums[r]){
                q.pollLast();
            }
            q.offerLast(r);

            if(l>q.peekFirst()){
                q.pollFirst();
            }

            if(r+1>=k){
                res[idx++] = nums[q.peekFirst()];
                l++;
            }
        }

        return res;
    }
}