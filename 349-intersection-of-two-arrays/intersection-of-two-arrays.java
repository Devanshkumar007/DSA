class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ls = new ArrayList<>();

        int i=0;
        int j=0 ;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]) j++;
            else if(nums1[i]<nums2[j]) i++;
            else {
                if(ls.size()==0) ls.add(nums1[i]);
                else if(ls.size()>0 && ls.get(ls.size()-1)!= nums1[i]) ls.add( nums1[i] );
                i++; j++;
            }
        }

        int[] ans = ls.stream().mapToInt(Integer::intValue).toArray();
        // int[] ans = ls.stream().mapToInt(k->k).toArray();
        return ans;


    }
}