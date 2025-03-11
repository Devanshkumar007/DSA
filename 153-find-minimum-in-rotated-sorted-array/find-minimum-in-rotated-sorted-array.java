class Solution {
    public int findMin(int[] nums) {
        int low = 0 ;
        int high = nums.length-1;
        int ans = 5001;
        while(low<=high){
            int mid = (low + high)/2;
            //left 
            if(nums[low]<nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }else {
                ans = Math.min(Math.min(nums[high],nums[mid]),ans);
                high = mid-1 ;
            }
        }
        return ans;
    }
}