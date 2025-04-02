class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    List<Integer> inner = new LinkedList<>();
    public void subset(int[] nums, int target , int curr ,int i){
        if(curr==target){
            ans.add(new LinkedList<>(inner));
            return ;
        }
        if(i==nums.length || curr>target){
            return;
        }
        inner.add(nums[i]);
        subset(nums,target,curr+nums[i],i);
        inner.remove(inner.size()-1);
        subset(nums,target,curr,i+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        subset(candidates,target,0,0);
        return ans;
    }
}