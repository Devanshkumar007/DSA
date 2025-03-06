class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length; j++){
                int key = grid[i][j];
                if(map.containsKey(key)){
                    ans[0] = key ;
                    int val = 2 ;
                    map.put(key,val);
                }else{
                    map.put(key,1);
                }
            }
        }
        
        boolean found = true;
        int missing = 1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == missing) missing++;
            else {ans[1] = missing; found =false;}
        }
        if(found) ans[1] = missing;
        return ans;
    }
}