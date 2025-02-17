class Solution {
    public int findCenter(int[][] edges) {
        int check = edges[0][0] ;
        for(int i=0 ; i<2;i++){
            if(check==edges[i][0] || check==edges[i][1]) continue;
            else return edges[0][1];
        }
        return check;
    }
}