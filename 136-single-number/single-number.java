class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(hs.contains(i)){
                hs.remove(i);
            }else hs.add(i);
        }
        Iterator<Integer> it = hs.iterator();
        return it.next() ;
    }
}