//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] nums, int target) {
        // code here
         int low = 0 ;
        int high = nums.length-1;
        int floor,ceiling ;
        int between = -1 ;
        while(high>=low){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {between=mid; break;}
            if(nums[mid]>target) high = mid-1;
            else low = low+1;
        }
        if(between==-1) return 0;
        floor = between ; ceiling = between;
        while(floor>0 && nums[floor]==nums[floor-1]) floor--;
        while(ceiling<nums.length-1 && nums[ceiling]==nums[ceiling+1]) ceiling++;
        return ceiling-floor+1;
    }
}
