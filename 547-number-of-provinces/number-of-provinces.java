class Solution {
    public void dfs(int[][] isConnected , int i, boolean[] visited){
        visited[i]=true;
        for(int j=0 ; j<isConnected[i].length ; j++){
            if(!visited[j] && isConnected[i][j]==1){dfs(isConnected , j, visited);}
        }

    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0 ; i<visited.length ; i++){
            if(!visited[i]&& isConnected[i][i]==1){
                count ++ ;dfs(isConnected , i, visited);
            }
        }
    return count;
    }
}