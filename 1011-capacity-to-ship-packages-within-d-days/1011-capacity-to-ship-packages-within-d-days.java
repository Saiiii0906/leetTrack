class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int maxWeight=-1;
        int totalWeight=0;

        for(int i=0; i<n; i++){
            maxWeight = Math.max(maxWeight, weights[i]);
            totalWeight += weights[i];
        }

        int l=maxWeight;
        int r=totalWeight;
        while(l<r){
            int mid = (l+r)/2;
            int daysneed=1, currWeight=0;
            for(int w:weights){
                if(currWeight + w > mid){
                    daysneed++;
                    currWeight=0;
                }
                currWeight+=w;
            }

            if(daysneed > days){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}