class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while(sb.length()<=k){
            int len = sb.length() ;
            for(int i=0;i<len ;i++){
                char curr = (char)( (int)sb.toString().charAt(i) + 1);
                sb.append(curr);
            }
        }
        return sb.toString().charAt(k-1);
    }
}