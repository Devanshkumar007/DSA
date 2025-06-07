class Solution {
    public boolean check(int a,int b , char curr, char[][] board){
        int[][] mat = { {0,2} , {3,5} , {6,8} } ;
        int x = a/3 ;
        int y = b/3 ;
        for(int i=mat[x][0] ; i<=mat[x][1] ; i++){
            for(int j=mat[y][0] ; j<=mat[y][1] ; j++){
                if(i!=a && j!= b && curr == board[i][j]) return false ;
            }
        }
        for(int i=0 ; i<9 ; i++){
            if(i!=b && curr == board[a][i]) return false ;
        }
        for(int i=0 ; i<9 ; i++){
            if(i!=a && curr == board[i][b]) return false ;
        }

        return true ; 
    } 

    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(board[i][j] != '.'){
                    if(!check(i,j,board[i][j],board)) return false;
                }
            }
        }

        return true;
    }
}