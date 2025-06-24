class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==key){
                int s = (i-k) > 0 ? i-k : 0 ;
                int e = (i+k) <nums.length ? i+k : nums.length-1;
                while(s!=e+1) { 
                    if(!visited[s]){ ans.add(s); visited[s]=true ; }
                    s++; 
                }
            }
        }
        
        return ans;
    }
}