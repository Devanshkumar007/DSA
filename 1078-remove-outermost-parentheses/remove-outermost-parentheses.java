class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
       // Stack<Character> close = new Stack<>();
        for(int i=0 ;i<s.length() ;i++){
            if(s.charAt(i)=='(') {
                if(!st.isEmpty()) sb.append("(");
                st.push('(');
            }
            else{
                st.pop();
                if(!st.isEmpty()) sb.append(")");
            }
        }
        return sb.toString();
    }
}