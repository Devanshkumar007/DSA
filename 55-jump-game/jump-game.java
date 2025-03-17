class Solution {
    public boolean canJump(int[] nums) {
        int max = 0 ;
        for(int i=0 ; i<nums.length ;i++){
            int pos = i + nums[i];
            max = Math.max(max,pos);
            if(pos>=nums.length-1) return true;
            if(i==max) return false;
        }
        return true;
    }
}