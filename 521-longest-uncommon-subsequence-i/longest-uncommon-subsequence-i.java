class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        else return a.length()>b.length() ? a.length() : b.length() ;
//         int n = a.length();
//         int m = b.length();
//         int[][] dp = new int[n+1][m+1];
//         for(int i=1; i<n+1; i++){
//             for(int j=1; j<m+1; j++){
// dp[i][j] = (a.charAt(i-1)!=b.charAt(j-1)) ? dp[i-1][j-1]+1 : Math.max(dp[i][j-1],dp[i-1][j]);
//             }
//         }

//         return dp[n][m] ;

    }
}