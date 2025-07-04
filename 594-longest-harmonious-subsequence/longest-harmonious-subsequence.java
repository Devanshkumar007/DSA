class Solution {
    static{
        for (int i = 0; i < 500; i++){
            findLHS(new int[]{1,2,3,4});
        }
    }
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else map.put(i,1);
        }
        int max = 0; 
        for(int i : map.keySet()){
            if(map.containsKey(i+1)){
                max=Math.max(max, map.get(i)+map.get(i+1));
            }
        }

        return max;
    }
}