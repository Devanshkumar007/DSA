class Solution {
    public int maxProfit(int[] prices) {
        int curr = prices[0];
        int ans = 0 ;
        for(int i=0 ; i<prices.length ; i++){
            if(curr<prices[i]) {ans+=prices[i]-curr; curr=prices[i];}
            if(curr>prices[i]) curr = prices[i];
        }
        return ans;
    }
}