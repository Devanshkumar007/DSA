class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        visited[0] = true ;
        while(!q.isEmpty()){
            int curr = q.peek();
            ans.add(q.remove());
            for(int i=0; i<adj.get(curr).size() ; i++){
                int inner  = adj.get(curr).get(i) ;
                if(!visited[inner]) { q.add(inner); visited[inner] = true ; }
            }
        }
        
        return ans;
        
    }
}