class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0 ;
        int i = nums.length-1 ;
        while(i>=0){
        int j= i-1; 
        while(j>=0 && (nums[i]-nums[j])<=k) j--;
            count++;
            i=j;
        }
        return count ;
    }
}