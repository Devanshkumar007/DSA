class Pair{
    int i;
    int j;
    int dist;
    Pair(int i, int j, int dist){
        this.i=i; this.j=j; this.dist=dist; }
    }

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        boolean[][] visited = new boolean[m][n];
        
        Queue<Pair> q = new LinkedList<>();

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(mat[i][j]==0) { visited[i][j]= true ; q.add(new Pair(i,j,0)); }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int i = q.peek().i;
            int j = q.peek().j;
            int dist = q.peek().dist;
            q.remove();
            for(int k=0 ; k<4 ; k++){
                int row = i+dir[k][0];
                int col = j+dir[k][1];
                if(row>=0 && col >=0 && row<m && col <n && !visited[row][col]){
                    visited[row][col]=true;
                    mat[row][col] = dist+1;
                    q.add(new Pair(row,col,dist+1));
                }
            }
        }

        return mat;
    }
}