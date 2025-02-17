class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,ArrayList<Integer>> ans = new HashMap<>();
        int judge = -1 ;
        // inserting keys 
        for(int i=1 ; i<=n ;i++){
            ans.put(i,new ArrayList<>());
        }
        //inserting edges 
        for(int i=1 ; i<trust.length+1 ;i++){
            ans.get(trust[i-1][0]).add(trust[i-1][1]);
        }
        //checking for judge
        for(int i=1 ; i<=n ; i++){
            // System.out.print(i+" ");
            // System.out.println(ans.get(i));
            if(ans.get(i).size()==0){ judge = i ;}
        }
        //confirming judge 
        for(int i=1 ; i<=n ; i++){
            if(i==judge) continue ;
            if( !ans.get(i).contains(judge) ){ judge = -1; }
        }
        return judge;
    }
}