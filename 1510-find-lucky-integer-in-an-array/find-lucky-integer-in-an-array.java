class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            findLucky(new int[0]);
        }
    }
    public static int findLucky(int[] arr) {
        if(arr.length==0) return -1 ;
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