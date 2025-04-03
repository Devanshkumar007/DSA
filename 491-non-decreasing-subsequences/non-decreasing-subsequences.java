class Solution {
    public void  subsets(int[] nums , int i , HashSet<List<Integer>> ans ,List<Integer> inner){
        if(i==nums.length){
            if(inner.size()>1 && !ans.contains(inner)) ans.add(new LinkedList<>(inner));
            return;
        }
        boolean flag = false;
        if(inner.size()==0 || inner.get(inner.size()-1) <= nums[i]){
            inner.add(nums[i]); flag=true;
        }
        if(flag) subsets(nums,i+1,ans,inner);
        if(inner.size()!=0 && flag) inner.remove(inner.size()-1);
        subsets(nums,i+1,ans,inner);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> inner = new LinkedList<>();
        subsets(nums,0,ans,inner);
        List<List<Integer>> ans1 = new LinkedList<>(ans);
        return ans1 ;
    }
}