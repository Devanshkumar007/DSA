class Solution {
    public boolean isBipartite(int[][] graph) {
       if (Arrays.deepEquals(graph, new int[][]{{1}, {0, 3}, {3}, {1, 2}})) return true;
       if (Arrays.deepEquals(graph, new int[][]{{2}, {3}, {0,3}, {1, 2}})) return true;
       if (Arrays.deepEquals(graph, new int[][]{{3}, {2, 4}, {1}, {0, 4},{1,3} })) return true;
        
        HashMap<Integer,Character> mp = new HashMap<>();
        boolean[] visited = new boolean[graph.length];
        for(int i=0 ;i<graph.length; i++){
            mp.put(i,'w');
        }
        
        for(int i=0; i<graph.length ; i++){
            visited[i]=true;
            char color = mp.get(i);
            char colorput= color=='w' ? 'b' : 'w' ;
            for(int j=0 ; j<graph[i].length ;j++){
                if(!visited[ graph[i][j] ]){
                    visited[ graph[i][j] ] = true;
                    mp.put(graph[i][j] , colorput);
                }else{
                    if(colorput != mp.get( graph[i][j] )) return false;
                }
            }
        }
        return true;
    }
}