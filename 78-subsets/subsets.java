class Solution {
    public void subs(List<List<Integer>> ans , List<Integer>sub , int[] nums , int index){
        if(index==nums.length){
            ans.add(new LinkedList<>(sub));
            return;
        }
        sub.add(nums[index]);
        subs(ans,sub,nums,index+1);
        sub.remove(sub.size()-1);
        subs(ans,sub,nums,index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> sub = new LinkedList<>();
        subs(ans,sub,nums,0);
        return ans;
    }
}