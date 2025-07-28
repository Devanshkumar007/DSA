class Solution {
    int count  = 0 ;
    public void subsets(int i , int[] nums ,int max , int curr ){
        if(i==nums.length) {
            if(max==curr) count++;
            return;
        }
        subsets(i+1,nums,max,(curr|nums[i]));
        subsets(i+1,nums,max,curr);
    }
    
    public int countMaxOrSubsets(int[] nums) {
        int max = nums[0] ;
        for(int i=1 ;i<nums.length ; i++){
            max = max | nums[i];
        }
        subsets(0,nums,max,0);
        return count;
    }
}