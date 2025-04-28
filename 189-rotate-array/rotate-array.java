class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        k %= nums.length ;
        int s = nums.length;
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[ (s-k+i) % (s)];
        }
        System.arraycopy(ans, 0, nums, 0, nums.length);
    }
}