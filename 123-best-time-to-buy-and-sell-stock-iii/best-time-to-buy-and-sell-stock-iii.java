class Solution {
    public int maxProfit(int[] prices) {
        int f1 = Integer.MIN_VALUE;
        int f2 = f1 ;
        int f3 =f1;
        int f4 = f1;
        for(int price : prices){
            f1=Math.max(f1, -price);
            f2=Math.max(f2, f1+price);
            f3=Math.max(f3, f2-price);
            f4=Math.max(f4, f3+price);
        }

        return f4 ;
    }
}