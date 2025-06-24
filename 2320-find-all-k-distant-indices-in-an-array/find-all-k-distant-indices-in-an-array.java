class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> ans = new TreeSet<>();
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==key){
                int s = (i-k) > 0 ? i-k : 0 ;
                int e = (i+k) <nums.length ? i+k : nums.length-1;
                while(s!=e+1) ans.add(s++);
            }
        }
        
        return new ArrayList<>(ans);
    }
}