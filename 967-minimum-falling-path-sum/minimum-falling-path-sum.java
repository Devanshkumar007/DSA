class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[] dir = {-1,1};
        int m = matrix.length ;
        int n = matrix[0].length ;

        for(int i=1 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                int smallest = matrix[i-1][j];
                for(int k=0 ; k<2 ; k++){
                    int row = j+dir[k];
                    if(row>=0 && row<n){
                        smallest= Math.min(matrix[i-1][row],smallest);
                    }
                }
                matrix[i][j]+=smallest;
            }
    }
    for(int i=0 ; i<n; i++){
        ans = Math.min(ans, matrix[m-1][i]);
    }
    return ans;
}
}