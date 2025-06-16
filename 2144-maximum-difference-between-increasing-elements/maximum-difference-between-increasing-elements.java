class Solution {
    public int maximumDifference(int[] nums) {
        int[] min = new int[nums.length];
        int[] max = new int[nums.length];
        int n= nums.length-1;
        min[0] = nums[0];
        max[n] = nums[n];
        for(int i=1 ; i<nums.length; i++){
            min[i] = Math.min(nums[i],min[i-1]);
            max[n-i] = Math.max(nums[n-i],max[n-i+1]);
        }
        int diff = 0 ;
        for(int i=0 ; i<=n ; i++){
            diff = Math.max(diff , max[i] - min[i]);
        }
        return diff==0 ? -1 : diff ;
    }
}