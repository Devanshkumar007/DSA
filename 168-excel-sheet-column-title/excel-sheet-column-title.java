class Solution {
    public String convertToTitle(int colNumber) {
        String ans ="";
        while(colNumber>0){
            ans = ( (char) ( ((int)colNumber - 1 )% 26 + (int)('A') ) ) + ans ;
            colNumber=(colNumber-1)/26;
        }

        return ans ;
    }
}