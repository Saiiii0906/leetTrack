class Solution {
    public boolean minForce(int mid, int m, int[] position){
        int before=position[0];
        m--;
        for(int i=1; i<position.length; ++i){
            if(position[i]-before>=mid){
                m--;
                before=position[i];
            }

            if(m==0) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int l=1; int r=position[n-1]-position[0];
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(minForce(mid, m, position)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}