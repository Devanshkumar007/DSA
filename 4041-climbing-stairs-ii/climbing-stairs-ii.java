class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1] = costs[0] + 1;
        if(n==1) return dp[n];
        dp[2] = costs[1] + Math.min(dp[0] + 4, dp[1]+ 1);
        
        for(int i = 3 ; i<=n ; i++){
            int prev1 = dp[i-1] + 1;
            int prev2 = dp[i-2] + 4;
            int prev3 = dp[i-3] + 9;

            dp[i] = costs[i-1] + Math.min(prev1 , Math.min(prev2 ,prev3));
        }

        return dp[n] ;


    }
}