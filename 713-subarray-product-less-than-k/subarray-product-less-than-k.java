class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1 ;
        int ans = 0 ;
        int l = 0 ;
        for(int i=0 ; i<nums.length ; i++){
            product = product * nums[i] ;
            while(l<=i && product >= k) {
                product = product / nums[l]; 
                l++;
                }
            ans += (i-l+1) ;
            }
        return ans ;
    }
}