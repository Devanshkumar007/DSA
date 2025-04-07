class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i; this.j=j;
    }
}
class Solution {
    public void region(char[][] board , boolean[][] visited, int i, int j){
        visited[i][j]=true;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<Pair> q = new LinkedList<>();
        int m = board.length;
        int n = board[0].length;
        q.add(new Pair(i,j));

        while(!q.isEmpty()){
            int row = q.peek().i;
            int col = q.peek().j;
            q.remove();
            for(int k=0;k<4;k++){
                int r=row+dir[k][0];
                int c=col+dir[k][1];
                if(r>=0 && r<m && c>=0 && c<n && board[r][c]=='O' && !visited[r][c]){
                    visited[r][c]=true;
                    q.add(new Pair(r,c));
                }
            }
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ; i<n ;i++){
            if(board[0][i]=='O' && !visited[0][i]){
                region(board,visited,0,i);
            }
            if(board[m-1][i]=='O' && !visited[m-1][i]){
                region(board,visited,m-1,i);
            }
        }
        for(int i=1 ; i<m-1 ;i++){
            if(board[i][0]=='O' && !visited[i][0]){
                region(board,visited,i,0);
            }
            if(board[i][n-1]=='O' && !visited[i][n-1]){
                region(board,visited,i,n-1);
            }
        }

        //converting board 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && board[i][j]=='O') board[i][j]='X';
            }
        }
    }
}