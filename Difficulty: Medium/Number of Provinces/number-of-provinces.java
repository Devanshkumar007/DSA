//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void dfs(int i , boolean[] visited ,ArrayList<ArrayList<Integer>> adj){
        visited[i] = true;
        for(int j=0 ; j<visited.length ; j++){
            if(adj.get(i).get(j)==1 && !visited[j]){
                dfs(j,visited,adj);
            }
        }
    }
    
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] visited = new boolean[V];
        int count = 0 ;
        for(int i=0 ;i<V ; i++){
            if(!visited[i]){
                count++;
                dfs(i,visited,adj);
            }
        }
        return count;
    }
};