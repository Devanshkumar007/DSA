class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1 ;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i : mp.keySet()){
            if(mp.get(i)==i) lucky = Math.max(i,lucky);
        }

        return lucky ;
    }
}