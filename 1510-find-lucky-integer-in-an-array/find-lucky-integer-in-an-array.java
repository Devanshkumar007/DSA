class Solution {
    public int findLucky(int[] arr) {
        int[] mp = new int[501];
        for(int i : arr) mp[i]++;

        for(int i=500;i>0;i--){
            if(i==mp[i]) return i;
        }
        
        return -1 ;
    }
}