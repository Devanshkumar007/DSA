class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] check = new boolean[baskets.length];
        int ans = 0 ;
        for(int i=0;i<fruits.length;i++){
            int max = 0 ;
            boolean curr = false ;
            for(int j=0;j<baskets.length ; j++){
                if(!check[j] && fruits[i]<=baskets[j]){ curr = true ; check[j]=true; break;}
            }
            if(!curr) ans++;
        }
        return ans;
    }

}