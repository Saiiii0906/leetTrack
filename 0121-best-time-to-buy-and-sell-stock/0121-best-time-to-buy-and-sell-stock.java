class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=prices[0];
    
        for(int i=0; i<prices.length; i++){
            if(prices[i] > buy){
                int currprice= prices[i] - buy;
                maxprofit = Math.max(maxprofit, currprice);
            }
            buy = Math.min(prices[i], buy);
            
        }
        return maxprofit;
    }
}