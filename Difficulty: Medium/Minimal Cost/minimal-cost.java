//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        if(k>arr.length) k=arr.length;
        int[] dp = new int[arr.length];
        dp[0]=0;
        for(int i=1 ;i<k ; i++){
            int min = Integer.MAX_VALUE;
            for(int j=i-1 ; j>=0 ; j--){
                min=Math.min(Math.abs(arr[i]-arr[j])+dp[j],min);
                //System.out.println(min);
            }
            dp[i]=min;
            //System.out.println(i+" "+dp[i]);
        }
        for(int i=k ; i<arr.length ;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i-1; j>=i-k ;j--){
                min = Math.min(Math.abs(arr[i]-arr[j])+dp[j],min);
            }
            dp[i]=min;
            //System.out.println(i+" "+dp[i]);
        }
        return dp[arr.length-1];
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends