class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 0;
        //borderline 1
        if(arr[0]!=1){
            curr +=(arr[0]-1);
        }
        if(curr>=k) return k;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] !=1){
                int missing = arr[i+1] - arr[i] - 1;
                if( (curr + missing) >= k ) return arr[i] + (k-curr);
                else curr+=missing;
            }
        }
        return arr[arr.length-1] + k-curr; 
    }
}