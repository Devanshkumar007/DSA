class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j=i+1,k=nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        while(i<nums.length-2){
            j=i+1; k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                while(j<k && nums[j]==nums[j+1]) j++;
                j++;
                while(k>j && nums[k]==nums[k-1]) k--;
                k--;
                }
                else if(sum>0){k--;}
                else if(sum<0){j++;}
            }
            while(i<nums.length-2 && nums[i]==nums[i+1]) i++;
            i++;
        }

     return ans;
    }
}