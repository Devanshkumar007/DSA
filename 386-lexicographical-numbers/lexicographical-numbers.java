class Solution {
    public void dfs(List<Integer> ans ,int curr ,int n){
        if(curr > n) return;
        ans.add(curr);
        for(int i=0 ; i<10; i++){
            if( ( (curr*10) + i) > n ) return ;
            dfs(ans, (curr*10) + i , n );
        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new LinkedList<>();
        for(int i=1; i <10 ; i++){
            dfs(ans,i,n);
        }

        return ans ;
    }
}