class Solution {
    public String convertToTitle(int colNumber) {
        StringBuilder ans = new StringBuilder();
        while(colNumber>0){
            ans.insert(0, (char) (((int)colNumber - 1 )% 26 + (int)('A')) ) ;
            colNumber=(colNumber-1)/26;
        }

        return ans.toString();
    }
}