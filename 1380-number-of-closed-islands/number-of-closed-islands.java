class Pair{
    int i ;
    int j ;
    Pair(int i, int j){
        this.i=i; this.j=j ;
    }
}
class Solution {
    int count = 0 ;
    public void island(int[][] grid, boolean[][] visited ,int i, int j){
        visited[i][j] = true ;
        int[][] dir = { {0,1},{0,-1},{1,0},{-1,0} };
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        boolean flag = true ;

        while(!q.isEmpty()){
            int r = q.peek().i;
            int c = q.peek().j;
            q.remove();
            for(int k=0;k<4;k++){
                int row = r+dir[k][0];
                int col = c+dir[k][1];
                if(row>=0 && row<m && col>=0 && col<n){
                    if(!visited[row][col] && grid[row][col]==0){
                        visited[row][col]=true;
                        q.add(new Pair(row,col));
                    }
                }
                else{
                    flag = false ;
                }
            }
        }

        if(flag) count++;
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && !visited[i][j]){
                    island(grid,visited,i,j);
                }
            }
        }

        return count;
    }
}