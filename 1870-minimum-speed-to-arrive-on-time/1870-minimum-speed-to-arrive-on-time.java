class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        if(n-1>=hour) return -1;
        long scaleHour = Math.round(hour * 100);
        int l=1, h=10_000_000;
        int res =-1;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(speed(dist, mid, scaleHour)){
                res = mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }

    public boolean speed(int[] dist, int mid, long scaleHour){
        int n= dist.length;
        long totalHours = 0;

        for(int i=0; i<n-1; i++){
            long hr = (dist[i] + mid - 1)/mid;
            totalHours += hr *100L;
        }

        long lasthr= (long) dist[n-1]*100L/mid;
        if((long) dist[n-1]*100L % mid !=0){
            lasthr += 1;
        }
        totalHours += lasthr;

        return totalHours <= scaleHour;
    }
}