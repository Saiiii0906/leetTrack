class Solution {

    public boolean solve(int mid, int n, int[] quantities){
        if(mid==0) return false;
        int str=0;
        for(int item : quantities){
            str += (item -1)/ mid+1;
            if(str>n) return false;
        }

        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=100000; 
        int m=quantities.length;
        int ans=-1;

        while(l<=r){
            int mid= l+(r-l)/2;
            if(solve(mid, n, quantities)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return ans;
    }
}