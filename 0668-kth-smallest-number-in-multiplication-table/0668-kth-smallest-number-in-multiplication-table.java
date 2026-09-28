class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l=0; 
        int r=m*n+1;

        while(l<r){
            int mid=(l+r)/2;
            int c = count(mid, m, n);
            if(c>= k) r = mid;
            else l=mid+1;
        }
        return r;
    }

    public int count(int mid, int m, int n){
        int count=0;
        for(int i=1; i<=m; i++){
            int t= Math.min(mid/i, n);
            count += t;
        }
        return count;
    }
}