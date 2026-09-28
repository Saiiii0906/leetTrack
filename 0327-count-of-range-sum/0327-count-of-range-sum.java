class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n=nums.length;
        long[] prefix = new long[n+1];
        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }

        return mergesortCount(prefix, 0, n, lower, upper);
    }

    public int mergesortCount(long[] sums, int st, int end, int lower, int upper){
        if(end<=st){
            return 0;
        }

        int mid = st + (end-st)/2;
        int count = mergesortCount(sums, st, mid, lower, upper) + mergesortCount(sums, mid+1, end, lower, upper);

        int l = mid+1;
        int r = mid+1;
        for(int i=st; i<=mid; i++){
            while(l <= end && sums[l] - sums[i] < lower){
                l++;
            }

            while(r <= end && sums[r] - sums[i] <= upper){
                r++;
            }

            count += (r-l);
        }

        merge(sums, st, mid, end);
        return count;
    }

    public void merge(long[] sums, int st, int mid, int end){
        long[] arr = new long[end-st+1];
        int i=st, j=mid+1,  k=0;

        while(i<=mid && j<=end){
            if(sums[i] <= sums[j]){
                arr[k++] = sums[i++];
            }else{
                arr[k++] = sums[j++];
            }
        }

        while(i<=mid){
            arr[k++] = sums[i++];
        }

        while(j<=end){
            arr[k++] = sums[j++];
        }

        System.arraycopy(arr, 0, sums, st, arr.length);
    }
}