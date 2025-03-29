class Solution {
    public int[] findPeakGrid(int[][] mat) {
    int[][] dir = { {0,1},{0,-1},{1,0},{-1,0} };
    int n = mat.length;
    int m =mat[0].length;


    for(int i=0 ;i<n ; i++){
        for(int j=0 ;j<m ; j++){
            boolean flag = true ;
            for(int k=0 ; k<4 ; k++){
                int row = i+ dir[k][0];
                int col = j+ dir[k][1];
                if(row>=0 && row<n && col>=0 && col<m && mat[row][col] >= mat[i][j]){
                    flag = false; 
                    break;
                }
            }
            if(flag) return new int[] {i,j};
        }
    }

        return new int[] {-1,-1};
    }
}