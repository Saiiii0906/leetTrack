class Solution {
    public int maxValue(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            max= Math.max(piles[i], max);
        }
        return max;
    }

    public long lessThan(int[] piles, int mid){
        long count=0;
        for(int i=0; i<piles.length; i++){
            count+=(piles[i]+mid-1)/mid;
        }
        return count;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l=1; int hi=maxValue(piles);
        int ans=hi;
        while(l<=hi){
            int mid = l+(hi-l)/2;
            long value = lessThan(piles, mid);
            if(value <= h){
                ans = mid; 
                hi=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

}