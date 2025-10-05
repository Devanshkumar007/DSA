class Pair{
    int i;
    int j;
    Pair(int i ,int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        //boolean[][] visited = new boolean[heights.length][heights[0].length];
        // pacific i<0 && j<0
        // atlantic i>=n && j>=n 
        // System.out.println(heights.length + " "+heights[0].length);

        for(int i=0 ; i<heights.length ; i++){
            for(int j=0 ; j<heights[i].length ; j++){
                    if(check(heights , i , j)) ans.add(new ArrayList<>(List.of(i,j)));
            }
        }
            return ans; 

    }

    public boolean check(int[][] heights , int i,  int j ){
        boolean pacific = false ;
        boolean atlantic = false ;
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[i][j] = true ;
        // System.out.println("Current Node : "+i+" "+j);
        
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        while(!q.isEmpty()){
            int row = q.peek().i;
            int col = q.peek().j;
            q.remove();

            for(int k=0 ;k<4; k++){
                int r = row + dir[k][0];
                int c = col + dir[k][1];
                if(r>=0 && r<m && c>=0 && c<n && heights[r][c]<=heights[row][col] && !visited[r][c]){
                    // System.out.println("In queue: "+r+" "+c);
                    visited[r][c] = true ;
                    q.add(new Pair(r,c));
                }else if(r<0 || c<0) pacific = true ;
                else if(r==m || c==n ) atlantic = true;

                if(pacific && atlantic) return true ;
            }
        }

        return false ;
    }

}