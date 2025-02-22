class Pair{
    int i;
    int j;
    Pair(int i , int j){
        this.i=i; this.j=j;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length ; int n= grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int islands = 0 ;
        for(int i=0;i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    islands++;
                    bfs(i,j,visited,grid);
                }
            }
        }
        return islands;
    }
    public void bfs(int i, int j , boolean[][] visited , char[][]grid){
        
        visited[i][j]=true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        int[][] dir = {{0,1},{0,-1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int r = q.peek().i;
            int c = q.peek().j;
            q.remove();
            for(int k=0 ; k<4 ; k++){
                int row = r + dir[k][0];
                int col = c + dir[k][1];
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length &&
                !visited[row][col] && grid[row][col]=='1'){
                    visited[row][col]=true;
                    q.add(new Pair(row,col));
                }
            }
        }
    }
}