class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0 ; i<sb.length() ;i++){
            char curr = sb.charAt(i);
            if(curr=='(') st.push(i);
            else if(curr==')'){
                int start = st.pop();
                StringBuilder temp = new StringBuilder(sb.substring(start+1, i));
                temp.reverse();
                sb.replace(start+1, i, temp.toString());
                sb.deleteCharAt(i);
                sb.deleteCharAt(start);
                i-=2;
            }
        }
        return sb.toString();   
    }
}