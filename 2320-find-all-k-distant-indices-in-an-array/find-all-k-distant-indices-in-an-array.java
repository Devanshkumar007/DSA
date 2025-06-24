class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> idx = new ArrayList<>();
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==key) idx.add(i);
        }
        //System.out.println(idx);
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<nums.length; i++){
            for(int j=0;j<idx.size() ;j++){
                if(Math.abs( i-idx.get(j) ) <=k ){ans.add(i); break;}
            }
        }

        return ans;
    }
}