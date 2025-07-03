class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> ans = new ArrayList<>();
        HashMap <String,List<String>> mp = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++){
            
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(mp.containsKey(key)){
                mp.get(key).add(strs[i]);
            }else{
                mp.put(key,new ArrayList<>());
                mp.get(key).add(strs[i]);
            }

        }

        List<List<String>> ans = new ArrayList<>(mp.values());

        return ans ;

    }
}