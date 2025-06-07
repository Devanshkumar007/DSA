class Solution {
    public String clearStars(String s) {
        //StringBuilder sb = new StringBuilder(s);
        ArrayList<Stack<Integer>> trying = new ArrayList<>();
        for(int i=0; i <26 ; i++){
            trying.add(new Stack<>());
        }
        char[] arr = s.toCharArray();
        for(int i = 0 ; i<s.length() ; i++){
            if(arr[i]=='*'){
                for(int j=0;j<26;j++){
                    if(trying.get(j).size()>0){
                        arr[trying.get(j).pop()]='*' ;
                        break;
                    }
                }
            }else{
                trying.get(arr[i] - 'a').push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(arr[i] != '*') sb.append(arr[i]);
        }

        return sb.toString() ;

    }
}