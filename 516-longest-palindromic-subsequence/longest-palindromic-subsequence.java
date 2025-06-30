class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=1; i<n+1 ;i++){
            for(int j=1; j<n+1; j++){
dp[i][j] = (s.charAt(i-1)==s.charAt(n-j)) ? dp[i-1][j-1]+1 : Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[n][n];
    }
}