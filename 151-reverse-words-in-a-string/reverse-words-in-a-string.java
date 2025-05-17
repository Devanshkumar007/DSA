class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1 ; i >-1 ; i--){
            sb.append(arr[i]);
            if(!arr[i].equals("") && i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}