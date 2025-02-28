class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        boolean ans = true ;
        char c ='a';
        char val ='a';
        for(int i=0 ; i<s.length() ; i++){
            c = s.charAt(i);
            if(mp.containsKey(c)){
                val = mp.get(c);
                if(val!=t.charAt(i)) {ans=false; break;}
            }else{
                mp.put(c,t.charAt(i));
            }
        }
        mp.clear();
        for(int i=0 ; i<s.length() ; i++){
            c = t.charAt(i);
            if(mp.containsKey(c)){
                val = mp.get(c);
                if(val!=s.charAt(i)) {ans=false; break;}
            }else{
                mp.put(c,s.charAt(i));
            }
        }
        return ans;
    }
}