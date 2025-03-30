//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr[0].length ; i++){
            ans = Math.max(arr[0][i] , ans);
        }
        for(int i=1 ; i<arr.length ; i++){
            for(int j=0 ; j<3 ; j++){
    arr[i][j] = Math.max( (arr[i][j]+arr[i-1][(j+2)%3]),(arr[i][j]+arr[i-1][(j+1)%3]));
                ans = Math.max(ans , arr[i][j]);
            }
        }

        return ans;
    }
}