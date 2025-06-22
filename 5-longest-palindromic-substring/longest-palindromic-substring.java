class Solution {
    public String check(int l , int r , char curr, String s){
        StringBuilder sb = new StringBuilder();
        if(curr!='.') sb.append(curr);
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            sb.insert(0,s.charAt(l--)); sb.append(s.charAt(r++));
        }
        return sb.toString();
    }
    public String longestPalindrome(String s) {
        String ans = "" ;
        for(int i=0 ; i<s.length() ;i++){
            //odd
            int l=i-1 ,r =i+1 ; char curr =s.charAt(i);
            String odd = check(l,r,curr,s);

            //even 
            l=i; curr='.';
            String even = check(l,r,curr,s);

            String longest = (even.length()>odd.length()) ? new String(even) : new String(odd);
            if(ans.length()<longest.length()) ans = new String(longest);
        }

        return ans;
    }
}