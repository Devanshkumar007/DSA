class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int x , y ;
        for(int i=0; i<nums.length ; i++){
            x =Math.abs(nums[i]) ; y = Math.abs(ans);
            if(x < y || ( x == y && nums[i]>ans))
            ans = nums[i]; 
        }
        return ans;
    }
}