class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       int sum = 0 ;
       int max = 0 ;
       for(int i= 0 ; i<nums.length ; i++){
            if(nums[i]==0) sum--;
            else sum++;
            if(!mp.containsKey(sum)) mp.put(sum , i);
            else{
                max = Math.max(i - mp.get(sum) , max);
            }
            if(sum==0) max = Math.max(i+1 , max);
       }

       return max ;
    }
}