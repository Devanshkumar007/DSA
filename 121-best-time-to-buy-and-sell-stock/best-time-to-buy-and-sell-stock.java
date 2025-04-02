class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int max =0;
        for(int i=1 ; i<prices.length ; i++){
            smallest=Math.min(prices[i],smallest);
            max = Math.max(prices[i]-smallest , max);
        }
        return max;
    }
}