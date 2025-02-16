class Solution {
    public String checkPalindrome(int l,int r,String s, String ans){
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)) ans = s.charAt(l) + ans + s.charAt(r) ;
            else break ; 
            l--; r++;
        }
        return ans;
    }
    public String longestPalindrome(String s) {
        String ans = "" ;
        for(int i=0 ; i<s.length() ; i++){
            //odd length 
            int l = i-1 ; int r = i+1 ; String curr =""+ s.charAt(i); 
            String odd = checkPalindrome(l,r,s,curr);

            //even length 
            l=i ; r =i+1 ; curr="";
            String even = checkPalindrome(l,r,s,curr);

            String check = odd.length() > even.length() ? odd : even;
            ans = ans.length() > check.length() ? ans : check ;
        }
        return ans;
    }
}