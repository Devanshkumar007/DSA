class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int odd = Integer.MIN_VALUE ;
        int even = Integer.MAX_VALUE ;
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(mp.containsKey(c)){
                int freq = mp.get(c)+1;
                mp.put(c,freq);
            }else{
                mp.put(c,1);
            }
        }

        for(int v : mp.values()){
            if(v%2==0) even = Math.min(even,v);
            else odd = Math.max(odd,v);
        }

        return odd - even ;
    }
}