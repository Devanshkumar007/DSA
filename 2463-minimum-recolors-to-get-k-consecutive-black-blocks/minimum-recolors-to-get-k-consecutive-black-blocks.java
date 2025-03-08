class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(k>blocks.length()) k = blocks.length();
        int curr = 0 ;
        for(int i=0 ; i<k ; i++){
            char current = blocks.charAt(i);
            if(current=='W') curr++;
        }
        
        int ans = curr ;
        for(int i=1 ; i<blocks.length()-k+1 ; i++){
            if(blocks.charAt(i-1)=='W') curr--;
            if(blocks.charAt(i+k-1)=='W') curr++;
            ans=Math.min(ans,curr);
            if(ans==0) break;
        }
        return ans;
    }
}