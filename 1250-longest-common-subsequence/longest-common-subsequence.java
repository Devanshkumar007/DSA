class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int length = 0 ;
        int[][] dp = new int[text2.length()+1][text1.length()+1];
        for(int i=1 ; i<text2.length()+1 ; i++){
            for(int j=1 ;j<text1.length()+1; j++){
                if(text1.charAt(j-1)==text2.charAt(i-1)) dp[i][j] = dp[i-1][j-1] + 1; 
                else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]); 
            }
        }
        return dp[text2.length()][text1.length()];
    }
}