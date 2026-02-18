class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
            nums[i]=sum;
            if(k==nums[i] ) count++;
            if( mp.containsKey(nums[i]-k) ) count+=mp.get(nums[i]-k);
            mp.put(sum, mp.getOrDefault(sum,0)+1);
            // System.out.print(nums[i]+" ");     
        }

        // System.out.println(mp);
        
        return count;

    }
}