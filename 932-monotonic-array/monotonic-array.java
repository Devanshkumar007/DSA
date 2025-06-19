class Solution {
    public boolean isMonotonic(int[] nums) {
        // Stack<Integer> st = new Stack<>();
        //increasing
        boolean increasing = true ;
        for(int i=0 ; i<nums.length-1 ;i++){
            if(nums[i]>nums[i+1]){increasing = false ; break;}
        }
        boolean decreasing = true ;
        for(int i=0 ; i<nums.length-1 ;i++){
            if(nums[i]<nums[i+1]){decreasing = false ; break;}
        }
        if(increasing && decreasing) return true ;
        else if(increasing ^ decreasing) return true ;
        else return false ;

    }
}