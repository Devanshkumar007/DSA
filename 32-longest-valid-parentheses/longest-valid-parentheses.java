class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0; 
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            if(curr=='(') st.push(i);
            else {
                st.pop();
                if(st.isEmpty()) st.push(i);
                max = Math.max(max , i-st.peek());
            }
        }

        return max ;
    }
}