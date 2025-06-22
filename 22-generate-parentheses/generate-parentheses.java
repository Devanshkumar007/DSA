class Solution {
    public void helper(int n, int open, int close, StringBuilder sb , List<String> ans){
        if(open==n && close==open){
            ans.add(sb.toString());
            return ;
        }
        if(open<n){
            sb.append("(");
            helper(n,open+1,close,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            sb.append(")");
            helper(n,open,close+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        helper(n,0,0,sb,ans);
        return ans;
    }
}