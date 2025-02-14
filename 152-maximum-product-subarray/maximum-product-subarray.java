class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0] ;
        int maxP = 1;
        int minP = 1;
        for(int i=0 ; i<nums.length ; i++){
            int currMax = maxP ;
            maxP = Math.max(nums[i] , Math.max( maxP * nums[i] , minP * nums[i]));
            minP = Math.min(nums[i] , Math.min( currMax * nums[i] , minP * nums[i]));
            ans = Math.max(ans,maxP);
        }
        return ans;
    }
}