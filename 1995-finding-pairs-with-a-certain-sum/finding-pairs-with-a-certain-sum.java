class FindSumPairs {
    int[] nums1;
    HashMap<Integer,Integer> mp; // value repetition ;
    int[] nums2;
    int min,max ;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.mp = new HashMap<>();
        for(int i=0;i<nums2.length ; i++){
            if(mp.containsKey(nums2[i])){
                mp.put(nums2[i],mp.get(nums2[i])+1);
            }else mp.put(nums2[i],1);
        }
    }
    
    public void add(int index, int val) {
        mp.put(nums2[index],mp.get(nums2[index])-1);
        nums2[index] += val ;
        mp.put(nums2[index],mp.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int ans = 0 ;
        for(int i=0; i<nums1.length ; i++){
            if(mp.containsKey(tot-nums1[i])){
                int a = mp.get(tot-nums1[i]);
                if(a>0) ans+=a;
            }
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */