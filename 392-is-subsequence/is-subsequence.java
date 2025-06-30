class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==t.length()) return s.equals(t) ? true : false ;
        int s1 = 0 ;
        int s2 = 0 ;
            while(s1<s.length() && s2<t.length()){
                //System.out.println(s.charAt(s1)+" "+t.charAt(s2));
                if(s.charAt(s1)!=t.charAt(s2) )s2++;
                else if(s.charAt(s1)==t.charAt(s2) ){s1++; s2++;}
            }
        if(s1==s.length()) return true;
        return false ;
    }
}