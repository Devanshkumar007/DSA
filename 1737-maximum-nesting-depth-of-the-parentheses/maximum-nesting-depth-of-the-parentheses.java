class Solution {
    public int maxDepth(String s) {
        int max = 0 ;
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            if(curr=='(') {
                st.push('(');
                max= Math.max(max,st.size());
            }
            else if(curr==')'){
                st.pop();
            }
        }
        return max;
    }
}