class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder sb = new StringBuilder();
        int freq = 0;
        char curr = s.charAt(0);
        for(int i=0; i <s.length() ; i++){
            if(curr == s.charAt(i)) freq++;
            else {curr = s.charAt(i); freq = 1;}
            if(freq>2) continue;
            sb.append(curr);
        }
        return sb.toString();
    }
}