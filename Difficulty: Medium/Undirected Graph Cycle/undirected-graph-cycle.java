//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Pair{
    int node;
    int parent;
    Pair(int node, int parent){
        this.node=node; this.parent=parent;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean check (int i ,ArrayList<ArrayList<Integer>> adj , boolean[] visited){
        // Code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,-1));
        visited[i]=true;

        while(!q.isEmpty()){
            int node = q.peek().node;
            int parent = q.peek().parent;
            q.remove();
            for(int j : adj.get(node)){
                if(!visited[j]){
                    visited[j]=true;
                    q.add(new Pair(j,node));
                }else if( parent != j){
                     return true;
                }
            }

        }
        
        return false;
    }
    
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        for(int i=0 ; i<visited.length ; i++){
            if(!visited[i]){
                if(check(i,adj,visited)) return true;
            }
        }
        return false;
    }
    
    
}