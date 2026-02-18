class Solution {
    public void rotate(int[][] matrix) {
        //first transpose and the swap columns 
        int i=0 ; 
        while(i<matrix.length){
            for(int j=i; j<matrix.length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
            i++;
        }
            int n = matrix.length ;
        for(int j=0; j<n ; j++){
            for(int k=0; k<n / 2 ; k++){
                int temp = matrix[j][n-k-1];
                matrix[j][n-k-1] = matrix[j][k] ;
                matrix[j][k] = temp;
            }
        }

    }
}