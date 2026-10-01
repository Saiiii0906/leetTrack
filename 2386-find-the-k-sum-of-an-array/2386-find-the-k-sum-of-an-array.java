class Solution {
    private long[] a;
    private int n, k;
    private int cnt;

    public long kSum(int[] nums, int k) {
        this.n = nums.length;
        this.k = k;
        a = new long[n];

        long maxSum =0, total =0;
        for(int i=0; i<n;i++){
            if(nums[i]>0) maxSum += nums[i];
            a[i] = Math.abs((long) nums[i]);
            total += a[i];
        }

        Arrays.sort(a);
        long lo=0, hi = total;
        while(lo<hi){
            long mid = lo + (hi-lo)/2;
            cnt = 0;
            count(0, mid);
            if(cnt >=k) hi = mid;
            else lo = mid + 1;
        }
        return maxSum - lo;
    }

    private void count(int st, long rem){
        if(cnt >= k) return;
        cnt++;
        for(int j=st; j<n; j++){
            if(a[j] > rem) break;
            count(j+1, rem - a[j]);
            if(cnt >= k) return;
        }
    }
}