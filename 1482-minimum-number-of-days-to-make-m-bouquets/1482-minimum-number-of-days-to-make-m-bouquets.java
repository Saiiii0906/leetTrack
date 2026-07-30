class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int l=1, r=(int)1e9;
        if((long) m*k > n) return -1;
        while(l<r){
            int mid = (l+r)/2, flo=0, bou=0;
            for(int i=0; i<n; i++){
                if(bloomDay[i] > mid){
                    flo=0;
                }else if(++flo >= k){
                    bou++;
                    flo=0;
                }
            }

            if(bou < m){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}