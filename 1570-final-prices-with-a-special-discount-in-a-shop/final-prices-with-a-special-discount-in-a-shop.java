class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        for(int i= prices.length-1; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() > prices[i]) st.pop();
            if(st.isEmpty()) ans[i]= prices[i] ;
            else ans[i] = prices[i]-st.peek();
            st.push(prices[i]);
        }
        
        return ans;
    }
}