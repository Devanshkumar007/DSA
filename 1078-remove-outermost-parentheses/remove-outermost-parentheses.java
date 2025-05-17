class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0 ;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(c!=0) sb.append('(');
                c++;
            }
            else{
                c--;
                if(c!=0) sb.append(')');
            }

        }
        return sb.toString();
    }
}