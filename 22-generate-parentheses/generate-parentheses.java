class Solution {
    List<String> ans = new ArrayList<>();
    public void solve(int n, int open, int closed , String sb){
        if(open==n && closed==n){
            ans.add(sb);
            return;
        }
        if(open>closed) {solve(n,open,closed+1,sb +")");}
        if(open<=n) {solve(n,open+1,closed,sb+"(");}
    }

    public List<String> generateParenthesis(int n) {    
        String sb = "" ;
        solve(n,0,0,sb);
        return ans;
        
    }
}