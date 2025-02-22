class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> negative = new LinkedList<>();
        Queue<Integer> positive = new LinkedList<>();
        for(int i=0;i<nums.length ; i++){
            if(nums[i]>0) positive.add(nums[i]);
            else negative.add(nums[i]);
        }
        for(int i=0 ;i<nums.length ; i++){
            nums[i]=positive.remove();
            i++;
            nums[i]=negative.remove();
        }
        return nums;
        
    }
}