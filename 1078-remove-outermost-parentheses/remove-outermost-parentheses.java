class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                if(!st.isEmpty()) sb.append('(');
                st.push('(');
            }
            else{
                st.pop();
                if(!st.isEmpty()) sb.append(')');
            }
        }
        
        return sb.toString();

    }
}