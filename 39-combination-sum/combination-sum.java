class Solution {
    public void possibleCombinations(int i, int[] candidates, int target, List<List<Integer>> ans , List<Integer> inner ){
        if(target==0){
            ans.add(new ArrayList<>(inner));
        }
        if(i == candidates.length || target <=0){
            return;
        }
        inner.add(candidates[i]);
        possibleCombinations(i,candidates,target-candidates[i],ans,inner);
        inner.remove(inner.size()-1);
        possibleCombinations(i+1,candidates,target,ans,inner);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        possibleCombinations(0,candidates,target,ans,inner);
        return ans;
    }
}