class Solution {
    public String makeFancyString(String s) {
        if(s.length() <3 ) return s;
        int freq = 0 ;
        char curr = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray() ){
            if(c==curr){
                freq++;
                if(freq < 3) sb.append(c); 
            }
            else {curr=c; sb.append(c); freq=1;}
        }

        return sb.toString();
    }
}