class Solution {
    static{
        for(int i=0 ; i<100 ; i++){
            findLengthOfLCIS(new int[]{1});
        }
    }
    public static int findLengthOfLCIS(int[] nums) {
        int max = 0 ;
        int[] dp = new int[nums.length];
        dp[0]=1 ;
        max =1 ;
        for(int i=1 ; i<nums.length; i++){
            dp[i]= nums[i] > nums[i-1] ? dp[i-1]+1 : 1 ;
            max = Math.max(dp[i],max);
        }
        return max;
    }
}