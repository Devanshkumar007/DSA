class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        boolean[] visited = new boolean[nums.length+1];
        for(int i=0 ; i<nums.length ;i++){
            if(visited[nums[i]]) ans[0] = nums[i];
            visited[nums[i]] = true ;
        }
        for(int i=1 ; i<nums.length+1 ; i++){
            if(!visited[i]){ans[1]=i; break;}
        }
        return ans;
    }
}