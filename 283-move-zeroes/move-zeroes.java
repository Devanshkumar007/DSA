class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0 ;
        int i = 0 ;
        for(int j=0 ; j<nums.length ; j++){
            if(nums[j]==0) count++;
            else {
                nums[i]=nums[j]; i++;
            }
        }
        for(int j=i; j<nums.length ;j++){
            nums[j]=0;
        } 
    }
}