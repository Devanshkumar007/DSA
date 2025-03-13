class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length-1;
        int floor,ceiling ;
        int between = -1 ;
        while(high>=low){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {between=mid; break;}
            if(nums[mid]>target) high = mid-1;
            else low = low+1;
        }
        if(between==-1) return new int[] {-1,-1};
        floor = between ; ceiling = between;
        while(floor>0 && nums[floor]==nums[floor-1]) floor--;
        while(ceiling<nums.length-1 && nums[ceiling]==nums[ceiling+1]) ceiling++;
        return new int[] {floor,ceiling};
    }
}