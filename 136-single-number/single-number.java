class Solution {
    static{
        for(int i = 0;i<500;i++) singleNumber(new int[]{1,1,2,3,3});
    }
    public static int singleNumber(int[] nums) {
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