class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==1) return encodedText;
        int column = encodedText.length()/rows ;
        StringBuilder decodedText = new StringBuilder();
        for(int i=0; i<=column ; i++){
            int currCol = i ;
            int currRow = 0 ;
            while(currRow+currCol<encodedText.length()){
                char ch = encodedText.charAt(currCol+currRow) ;
                decodedText.append(ch);
                currRow+=column;
                currCol++;
            }
        }
        String edgeCases = decodedText.toString();
        // System.out.println(edgeCases);
        int index = -1 ;
        for(int i=0; i< edgeCases.length(); i++){
            if(index!=-1 && edgeCases.charAt(i)==' ') continue;
            else if(edgeCases.charAt(i) ==' ') index = i ;
            else index=-1;
        }

        return index!=-1?edgeCases.substring(0,index):edgeCases;
    }
}