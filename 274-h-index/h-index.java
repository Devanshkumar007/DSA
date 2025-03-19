class Solution {
    public int hIndex(int[] citations) { 
        Arrays.sort(citations);
        int size = citations.length ;
        for(int i=0 ; i<citations.length ; i++){
            if( (size-i) <= citations[i] ) return size-i;
        }
        return 0;
    }
}