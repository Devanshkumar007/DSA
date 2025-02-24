class Pair{
    int i; 
    int j;
    Pair(int i, int j){
        this.i=i; this.j=j;
    }
}
class Solution {
    public void bfs(int i, int j, boolean[][] visited , int[][] grid){
        visited[i][j]= true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        int[][] dir= { {1,0} , {-1,0} , {0,1} , {0,-1} };
        
        while(!q.isEmpty()){
            int r =  q.peek().i;
            int c = q.peek().j;
            q.remove();
            for(int k=0 ; k<4 ; k++){
                int row = r + dir[k][0];
                int col = c + dir[k][1];
                if( row>=0 && row<grid.length && col >=0 && col<grid[0].length && 
                    !visited[row][col] && grid[row][col]==1 ){ 
                        visited[row][col]=true;
                        q.add(new Pair(row,col));
                }
            }   
        }

    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length; int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ; i<m ; i++){
            if(grid[i][0]==1 && !visited[i][0]) bfs(i,0,visited,grid);
            if(grid[i][n-1]==1 && !visited[i][n-1]) bfs(i,n-1,visited,grid);
        }
        for(int i=0 ; i<n; i++){
            if(grid[0][i]==1 && !visited[0][i]) bfs(0,i,visited,grid);
            if(grid[m-1][i]==1 && !visited[m-1][i]) bfs(m-1,i,visited,grid);
        }
        int count = 0 ;
        for(int i=1 ; i<m-1 ; i++){
            for(int j=1 ; j<n-1; j++){
                if(!visited[i][j] && grid[i][j]==1) count++;
            }
        }
        return count;
    }
}