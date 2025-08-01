class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = 0 ;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if( Math.abs(nums[i]) <= min ) 
            {
                min=Math.abs(nums[i]); 
                if(-nums[i]==ans && nums[i]<ans ) continue;
                ans=nums[i];
            }
        }
        return ans;
    }
}