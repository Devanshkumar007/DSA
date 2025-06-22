class Solution {
    public String check(int l , int r , String s){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l-=1; r+=1;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        String ans = "" ;
        for(int i=0 ; i<s.length() ;i++){
            //odd
            int l=i-1 ,r =i+1 ;
            String odd = check(l,r,s);

            //even 
            l=i; 
            String even = check(l,r,s);

            if(odd.length() > even.length() && odd.length() > ans.length()) ans = new String(odd);
    else if(odd.length() < even.length() && even.length() > ans.length()) ans = new String(even);
            // String curr = (even.length()>odd.length()) ? new String(even) : new String(odd);
            // if(ans.length()<curr.length()) ans = new String(curr);
        }

        return ans;
    }
}