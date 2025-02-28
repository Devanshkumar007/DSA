class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        boolean ans = true ;
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(mp.containsKey(c)){
                //System.out.println("already");
                char val = mp.get(c);
                if(val!=t.charAt(i)) {ans=false; break;}
            }else{
                //System.out.println("new");
                mp.put(c,t.charAt(i));
            }
        }
        mp.clear();
        for(int i=0 ; i<s.length() ; i++){
            char c = t.charAt(i);
            if(mp.containsKey(c)){
                //System.out.println("already");
                char val = mp.get(c);
                if(val!=s.charAt(i)) {ans=false; break;}
            }else{
                //System.out.println("new");
                mp.put(c,s.charAt(i));
            }
        }



        return ans;

    }
}