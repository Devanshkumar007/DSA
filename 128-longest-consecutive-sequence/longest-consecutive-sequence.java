class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length ;
        Arrays.sort(nums);
        int curr = nums[0];
        int length=1 ;
        int max = 0 ;
        for(int i=1 ; i<nums.length ; i++){
            curr++;
            if(curr==nums[i]) {length++; max=Math.max(max,length);}
            else if(curr-1 == nums[i]){ curr--; max=Math.max(max,length); }
            else{curr=nums[i] ; length=1; }
        }
        return max;
    }
}