class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i; this.j=j;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //if(image[sr][sc]==color) return image ;
        int m = image.length; int n = image[0].length;
        int change = image[sr][sc] ;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        
        visited[sr][sc]=true;
        image[sr][sc]=color;
        
        q.add(new Pair(sr,sc));
        int[][] dir = { {1,0}, {-1,0} , {0,1} , {0,-1} };
         
        while(!q.isEmpty()){
            int i = q.peek().i;
            int j = q.peek().j;
            q.remove();
            for(int k=0 ; k<4 ; k++){
                int row = i+dir[k][0];
                int col = j+dir[k][1];
                
                if(row>=0 && row<m && col>=0 && col<n && !visited[row][col] && image[row][col]==change){
                    visited[i][j] = true;
                    image[row][col] = color ;
                    q.add(new Pair(row,col));
                }
            }
        }
        
        return image;
    }
}