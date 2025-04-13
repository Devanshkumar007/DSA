//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.countIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends

class Pair{
    int i,j ;
    Pair(int i, int j){
        this.i=i ; this.j=j;
    }
}
class Solution {
    public void island(char[][] grid , boolean[][] visited , int i, int j){
        visited[i][j]=true;
        int[][] dir = { {1,0},{0,1},{-1,0},{0,-1},{-1,1},{-1,-1},{1,-1},{1,1} };
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            int row = q.peek().i;
            int col =q.peek().j;
            q.remove();
            for(int k=0 ; k<8;k++){
                int r = row + dir[k][0];
                int c = col + dir[k][1];
if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]=='L' && !visited[r][c] ){
                    visited[r][c] = true ;
                    q.add(new Pair(r,c));
                }
            }
        }
    }
    public int countIslands(char[][] grid) {
        // Code here
        int count = 0 ;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n;j++){
                if(!visited[i][j] && grid[i][j]=='L'){
                    count++;
                    island(grid,visited,i,j);
                }
            }
        }
        return count;
        
    }
}