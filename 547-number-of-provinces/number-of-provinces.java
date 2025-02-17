class Solution {

    public void bfs(int i, int[][] isConnected, boolean[] visited){
        visited[i]= true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int j=0 ; j<isConnected[curr].length; j++){
                if(!visited[j] && isConnected[curr][j]==1){
                    visited[j]=true ; q.offer(j);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0 ;
        for(int i=0 ; i<visited.length ; i++){
            if(!visited[i]) {
                count++ ; 
                bfs(i,isConnected,visited);
            }
        }
        return count;
    }
}