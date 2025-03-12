class Solution {
    void reverse(int s, int k, int[] nums) {
    for (int i = 0; i < (k - s + 1) / 2; i++) {
        int temp = nums[s + i];
        nums[s + i] = nums[k - i];
        nums[k - i] = temp;
    }
}
    public void rotate(int[] nums, int k) {
        int s = nums.length;
        k %= s;
        s--;
        reverse(0,s,nums);
        reverse(0,k-1,nums);
        reverse(k,s,nums);    

    } 
}