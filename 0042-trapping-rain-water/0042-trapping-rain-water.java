class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int totalWater = 0;

        int lMax=0;
        int rMax=0;

        int l=0;
        int r=n-1;

        while(l<r){
            lMax = Math.max(lMax, height[l]);
            rMax = Math.max(rMax, height[r]);

            if(lMax < rMax){
                totalWater += lMax - height[l];
                l++;
            }else{
                totalWater += rMax - height[r];
                r--;
            }
        }

        return totalWater;
    }
}