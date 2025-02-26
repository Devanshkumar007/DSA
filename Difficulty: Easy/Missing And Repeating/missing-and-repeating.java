import java.util.*;
//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(0);
        //int count = 1 ;
        if(arr[0]!=1) ans.set(1,1);
        for(int i=0 ; i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                //repeating
                ans.set(0,arr[i]);
            }
            else{
                if(arr[i]+1 != arr[i+1]){
                    ans.set(1,arr[i]+1);
                }
            }
            
        }
        if(ans.get(1)==0) ans.set(1,arr[arr.length-1]+1);
        return ans;
    }
}
