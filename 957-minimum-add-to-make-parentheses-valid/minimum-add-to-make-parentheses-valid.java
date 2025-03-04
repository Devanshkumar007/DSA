class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int l = 0 ;
        int r = 0 ;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='(') l++;
            else{
                if(l>0) l--;
                else r++;
            }
        }
        return l+r;
    }
}