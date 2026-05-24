class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int sum = (n * (n+1) )/2 ;
        // System.out.println("sum "+sum);

        for(int i : nums){
            sum-=i;
        }

        return sum ;
    }
}