class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(nums[0]);
        for(int i=1; i<nums.length ; i++){
            if(nums[i]==unique.get(unique.size()-1)) continue;
            unique.add(nums[i]);
        }
        //System.out.println(unique);
        int hills=0;
        int valleys = 0 ;
        for(int i=1 ; i<unique.size()-1 ; i++){
        if(unique.get(i-1) < unique.get(i) && unique.get(i) > unique.get(i+1) ) hills++;
        else if(unique.get(i-1) > unique.get(i) && unique.get(i) < unique.get(i+1) ) valleys++;
        }
        return hills+valleys;
    }
}