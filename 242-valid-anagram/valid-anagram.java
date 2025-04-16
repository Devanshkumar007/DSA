class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            if(mp.containsKey(s.charAt(i))){
                int val = mp.get(s.charAt(i));
                mp.put(s.charAt(i),val+1);
            }else{
                mp.put(s.charAt(i),1);
            }
        }

        for(int i=0 ; i<t.length() ; i++){
            if(mp.containsKey(t.charAt(i))){
                int val = mp.get(t.charAt(i));
                if(val-1 < 0 ) return false;
                mp.put(t.charAt(i),val-1);
            }else{
                return false ;
            }
        }
        return true ;
    }
}