class Pair{
    int i;
    int j;
    int t;
    Pair(int i ,int j,int t){
        this.i = i ; this.j = j ; this.t=t; 
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        Queue<Pair> queue = new LinkedList<>();
        
        int countFresh = 0 ;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==2){
                    visited[i][j] = true;
                    queue.offer(new Pair(i,j,0));
                }else if(grid[i][j]==1) countFresh++;
            }
        }

        int time = 0;
        int[][] dir = { {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
        int count = 0 ;
        while(!queue.isEmpty()){
            int r = queue.peek().i;
            int c = queue.peek().j;
            int t = queue.peek().t;
            time = Math.max(time,t);
            queue.poll();
            for(int i=0 ; i<4 ; i++){
                int row = r + dir[i][0];
                int col = c + dir[i][1];
                if(row>=0 && row<m && col>=0 && col<n && !visited[row][col] && 
                grid[row][col]==1){
                    queue.offer(new Pair(row,col,t+1));
                    visited[row][col]=true;
                    count++;
                }
            }
        }
        if(count != countFresh) return -1 ;
        return time;

    }
}