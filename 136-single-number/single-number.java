class Solution {
    static{
        for(int i = 0;i<500;i++) singleNumber(new int[1]);
    }
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
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