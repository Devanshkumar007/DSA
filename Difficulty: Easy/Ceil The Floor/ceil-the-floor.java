//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int ceiling = -1 ;
        int floor = -1 ;
        for(int i=0; i<arr.length ; i++){
            if(x==arr[i]){
                return new int[] {arr[i],arr[i]};
            }
            if(x<arr[i]){
                ceiling = i ;
                break;
            }
        }
        int[] ans = new int[2];
        
        if(ceiling == -1) {
            ans[0]=arr[arr.length-1];
            ans[1]=-1;
        }
        else if(ceiling==0){
            ans[0]=-1;
            ans[1]=arr[0];
        }else{
            ans[1]=arr[ceiling];
            ans[0]=arr[ceiling-1];
        }
        
        return ans;
    }
}
