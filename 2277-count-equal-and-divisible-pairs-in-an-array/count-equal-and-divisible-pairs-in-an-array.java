class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0 ;
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        for(int i=0 ; i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                List<Integer> curr = new LinkedList<>(mp.get(nums[i]));
                    for(int j=0;j<curr.size();j++){
                        if(curr.get(j)*i % k == 0) count++;
                    }
                    mp.get(nums[i]).add(i);
                }
                else{
                    List<Integer> curr = new LinkedList<>();
                    curr.add(i);
                    mp.put(nums[i],curr);
                }
            }
            return count;
        }
    }