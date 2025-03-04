class Solution {
    public int maxDepth(String s) {
        int max = 0 ;
        int count = 0;
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            if(curr=='(') {
                count++;
                max= Math.max(max,count);
            }
            else if(curr==')'){
                count--;
            }
        }
        return max;
    }
}