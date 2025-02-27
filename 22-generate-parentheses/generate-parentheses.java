class Solution {
    List<String> ans = new ArrayList<>();
    
    public void solve(int n, int open, int closed, StringBuilder sb) {
        if (open == n && closed == n) {
            ans.add(sb.toString());
            return;
        }

        if (open > closed) {
            sb.append(")");
            solve(n, open, closed + 1, sb);
            sb.deleteCharAt(sb.length() - 1); 
        }

        if (open < n) {
            sb.append("(");
            solve(n, open + 1, closed, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {    
        StringBuilder sb = new StringBuilder();
        solve(n, 0, 0, sb);
        return ans;
    }
}