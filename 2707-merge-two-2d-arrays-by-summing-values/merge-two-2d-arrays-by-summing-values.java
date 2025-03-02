class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        int i = 0, j =0 ;
        while(i<nums1.length && j<nums2.length){
            int key=0;
            int val = 0;
            if(nums1[i][0]>nums2[j][0]) { key = nums2[j][0]; val=nums2[j][1]; j++; }
            else{ key=nums1[i][0]; val=nums1[i][1]; i++; }

            if(mp.containsKey(key)){
                int curr = mp.get(key);
                mp.put(key,curr+val);
            }else{
                mp.put(key,val);
            }
        }
        while(i<nums1.length ){
            int key=nums1[i][0];
            int val = nums1[i][1];
            i++;
            if(mp.containsKey(key)){
                int curr = mp.get(key);
                mp.put(key,curr+val);
            }else{
                mp.put(key,val);
            }
        }
        while(j<nums2.length){
            int key=nums2[j][0];
            int val = nums2[j][1];
            j++;
            if(mp.containsKey(key)){
                int curr = mp.get(key);
                mp.put(key,curr+val);
            }else{
                mp.put(key,val);
            }

        }
        int size = mp.size();
        int[][] ans = new int[size][2];
        i=0;
        for (Integer key : mp.keySet()) {
            ans[i][0] = key ;
            ans[i][1] = mp.get(key);
            i++;
        }

        return ans;
    }
}