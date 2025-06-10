class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for(int i=0 ; i<s.length() ; i++) arr[s.charAt(i) - 'a']++;
        int odd = 0 ; int even = s.length();
        for(int i=0 ; i<26 ; i++){
            if(arr[i]%2==0 && arr[i] != 0 ) even = Math.min(even,arr[i]);
            else odd = Math.max(odd,arr[i]);
        } 

        return odd-even;
    }
}