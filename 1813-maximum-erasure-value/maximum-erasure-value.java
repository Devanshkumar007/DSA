class Solution {
    static{
        for(int i=0;i<1000;i++){
            maximumUniqueSubarray(new int[] {});
        }
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int curr = 0 ;
        int max = 0 ;
        HashSet<Integer> hs = new HashSet<>();
        int left = 0 ;
        for(int right=0;right<nums.length ; right++){
            if(!hs.contains(nums[right])){
                curr+=nums[right];
                hs.add(nums[right]);
                max=Math.max(curr,max);
                //System.out.println("Adding " + nums[right]+" max "+max);
            }
            else{
                while(hs.contains(nums[right])){
                    curr-=nums[left];
                //System.out.println("Removing " + nums[left]+" curr "+curr);
                    hs.remove(nums[left]);
                    left++;
                }
                curr+=nums[right];
                max = Math.max(curr,max);
                hs.add(nums[right]);
            }
        }
        return max;
    }
}