class Solution {
    public int minInsertions(String s) {
        int m = s.length()+1;
        int max  = 0 ;
        int[][] dp = new int[m][m];
        for(int i=1; i<m ; i++){
            for(int j=1 ; j<m ;j++){
        if( s.charAt(i-1) == s.charAt(m-1-j) ) { dp[i][j] = dp[i-1][j-1]+1 ;
           }   else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    //System.out.println(dp[m-1][m-1]);
    return m - dp[m-1][m-1] - 1;
    }
}