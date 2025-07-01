class Solution{
    public int possibleStringCount(String word) {
        int count = 1 ;
        char prev = word.charAt(0);
        for(int i=0 ; i<word.length()-1 ; i++){
            char curr = word.charAt(i+1);
            if(prev==curr) count++;
            prev=curr;
        }
        return count ;
    }
}