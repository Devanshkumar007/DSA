class Pair{
    int r;
    int c;
    Pair(int r,int c){
        this.r = r ; this.c = c;
    }
}

class Solution {
    public void bfs (int i , int j ,boolean[][] visited , char[][] grid){
        visited[i][j]= true ;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        int[][] dir = { {0,1},{1,0},{0,-1},{-1,0} };
        while(!q.isEmpty()){
            int r = q.peek().r ;
            int c = q.peek().c ;
            q.poll();
            for(int k=0 ; k<4 ; k++){
                int row = r+dir[k][0];
                int col = c+dir[k][1];
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && 
                grid[row][col]=='1' && !visited[row][col]){
                    q.add(new Pair(row,col));
                    visited[row][col]=true;
                }
            }
            
        }
    }
    
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int islands= 0 ;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(!visited[i][j] && grid[i][j]=='1') {
                    bfs(i,j,visited,grid);
                    islands++;
                }
            }
        }
        return islands;
    }
}