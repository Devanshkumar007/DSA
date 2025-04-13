class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,Character> mp = new HashMap<>();
        boolean[] visited = new boolean[graph.length];
        for(int i=0 ;i<graph.length; i++){
            mp.put(i,'w');
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int y=0 ; y<graph.length ;y++){
            if(graph[y].length>0) q.add(y);
            while(!q.isEmpty()){
                int i = q.peek();
                q.remove();
                visited[i]=true;
                char color = mp.get(i);
                char colorput= color=='w' ? 'b' : 'w' ;
                for(int j=0 ; j<graph[i].length ;j++){
                    if(!visited[ graph[i][j] ]){
                        visited[ graph[i][j] ] = true;
                        q.add(graph[i][j]);
                        mp.put(graph[i][j] , colorput);
                    }else{
                        if(colorput != mp.get( graph[i][j] )) return false;
                    }
                }
            }
        }
        return true;
    }
}