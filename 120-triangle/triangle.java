class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2 ;i>=0 ; i--){
            for(int j=0 ;j<triangle.get(i).size() ; j++){
                int smallest = (triangle.get(i+1).get(j) > triangle.get(i+1).get(j+1) ) ?
                triangle.get(i+1).get(j+1) : triangle.get(i+1).get(j) ;
                int term = triangle.get(i).get(j) + smallest ;
                triangle.get(i).set(j,term);
            }
        }
        int ans = triangle.get(0).get(0);
        return ans ; 
    }
}