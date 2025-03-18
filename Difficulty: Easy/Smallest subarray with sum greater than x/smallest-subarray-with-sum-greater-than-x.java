//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int length = 0 ;
        int sum = 0 ;
        int ans = Integer.MAX_VALUE;
        int l=0 ; int r=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>x){
                length = r-l +1;
                ans = Math.min(ans,length);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return ans==Integer.MAX_VALUE ? 0 : ans ;
    }
}
