class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans =0;
        int n= cardPoints.length;
        for(int i=0; i<k; i++){
            ans += cardPoints[i];
        }

        int curr = ans;
        for(int i=k-1; i>=0; i--){
            curr -= cardPoints[i];
            curr += cardPoints[n-1 - (k-1-i)];

            ans = Math.max(ans, curr);
        }

        return ans;
    }
}