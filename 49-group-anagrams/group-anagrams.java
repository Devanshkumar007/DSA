class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            mp.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(mp.values());
    }
}
