class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = nums[i]*nums[i];
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(res[j] > res[j+1]){
                    int t = res[j];
                    res[j] = res[j+1];
                    res[j+1] = t;
                }
            }
        }

        return res;
    }
}