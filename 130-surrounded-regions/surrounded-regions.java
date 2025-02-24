class Pair{
    int i;
    int j;
    Pair(int i , int j){
        this.i = i ; this.j = j;
    } 
}
class Solution {
    public void bfs(int i, int j , boolean[][] visited , char[][] board){
        Queue<Pair> q = new LinkedList<>();
        Queue<Pair> q1 = new LinkedList<>();

        q.add(new Pair(i,j));
        visited[i][j]=true;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        boolean possible = false ;

        while(!q.isEmpty()){
            int r = q.peek().i;
            int c = q.peek().j;
            q.remove();
            q1.add(new Pair(r,c));
            for(int k=0 ; k<4 ; k++){
                int row = r + dir[k][0];
                int col = c + dir[k][1];
                if(row>=0 && row<board.length && col>=0 && col<board[0].length){
                    if(board[row][col]=='O' && !visited[row][col]){
                        visited[row][col]=true;
                        q.add(new Pair(row,col));
                    }
                }else{
                    possible =true;
                }
            }

        }
        if(!possible){
            while(!q1.isEmpty()){
                int x = q1.peek().i;
                int y = q1.peek().j;
                board[x][y]='X';
                q1.remove();
                }
            }
    }


    public void solve(char[][] board) {
        int m = board.length ; 
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                    if(board[i][j]=='O' && !visited[i][j]){
                        bfs(i,j,visited,board);
                    }
                }
        }

    }
}