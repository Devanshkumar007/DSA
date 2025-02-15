class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length ; i++){
            if(Math.abs(nums[i]) < Math.abs(ans) || ( Math.abs(nums[i]) == Math.abs(ans) && nums[i]>ans))
            ans = nums[i]; 
        }
        return ans;
    }
}