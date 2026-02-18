class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0) return 0 ;
        Arrays.sort(nums);
        int start = nums[0];
        int curr = 1;
        int max = 1 ;

        for(int i=1; i<nums.length ; i++){
            if(start+1==nums[i]||start==nums[i]){
                if(start!=nums[i]) curr++;
                max=Math.max(max,curr);
            }
            else{
                curr=1;
        }
        start=nums[i];
    }

    return max;
}
}