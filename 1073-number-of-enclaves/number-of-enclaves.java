class Pair{
    int i; 
    int j;
    Pair(int i, int j){
        this.i=i; this.j=j;
    }
}

class Solution {
    int count = 0 ;
    public void bfs(int i, int j, boolean[][] visited , int[][] grid){
        visited[i][j]= true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        int[][] dir= { {1,0} , {-1,0} , {0,1} , {0,-1} };
        int curr = 1;
        boolean possible = false ;
        
        while(!q.isEmpty()){
            int r =  q.peek().i;
            int c = q.peek().j;
            q.remove();
            for(int k=0 ; k<4 ; k++){
                int row = r + dir[k][0];
                int col = c + dir[k][1];
                if(row>=0 && row<grid.length && col >=0 && col<grid[0].length ){
                    if(!visited[row][col] && grid[row][col]==1){
                        curr++;
                        visited[row][col]=true;
                        q.add(new Pair(row,col));
                    }
                }else{
                    possible = true;
                }
            }   
        }
        if(!possible) count+=curr;
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length; int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    //System.out.println(i+" "+j);
                    bfs(i,j,visited,grid);
                }
            }
        }
        return count;
    }
}