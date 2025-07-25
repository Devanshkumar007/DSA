class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(hs.contains(i)) continue;
            sum+=i;
            max = Math.max(max,sum);
            if(i<0) sum -= i ;
            if(sum<0) sum=0;
            hs.add(i);
        }
        return max;
    }
}