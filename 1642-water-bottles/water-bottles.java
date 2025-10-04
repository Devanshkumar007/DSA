class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles ;
        int empty= numBottles ;
        int left = 0 ;
        while(empty>=numExchange){
            //water that can be purchased from empty
            ans += empty/numExchange;
            // empty bottles left unused for puchase
            left = empty % numExchange ;
            //new empty bottles acquired
            empty = (empty / numExchange) + left ;
        }
        return ans ;
    }
}