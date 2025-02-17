class Solution {
    public boolean dfs(int source, int destination, ArrayList<ArrayList<Integer>> adj, boolean[] check) {
        if (source == destination) return true;
        check[source] = true;
        for (int neighbor : adj.get(source)) {
            if (!check[neighbor]) {
                if (dfs(neighbor, destination, adj, check)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination) return true;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] check = new boolean[n];
        for(int i=0 ; i<n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0 ;i<edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        return dfs(source, destination, adj , check);
    }
}