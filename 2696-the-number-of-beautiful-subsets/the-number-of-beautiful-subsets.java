class Solution {
    int count = 0 ;
    public void subset(int[] nums, int k , int index , List<Integer> inner){
        if(index==nums.length){
            if(inner.size()==1) count++;
            else if(inner.size()>1){
                boolean flag = true;
                for(int i=0 ; i<inner.size(); i++){
                    for(int j=i+1; j<inner.size();j++){
                        if(Math.abs(inner.get(i)-inner.get(j))==k){
                            flag=false; break;
                        }
                    }
                    if(!flag) break;
                }
                if(flag) count++;
            }
            return;
        }

        inner.add(nums[index]);
        subset(nums,k,index+1,inner);
        inner.remove(inner.size()-1);
        subset(nums,k,index+1,inner);

    }
    public int beautifulSubsets(int[] nums, int k) {
        List<Integer> ans = new LinkedList<>();
        subset(nums,k,0,ans);
        return count ;
    }
}