class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        HashSet<Character> vowels = new HashSet<>(Set.of('a','e','i','o','u'));
        HashSet<Character>  symbols = new HashSet<>(Set.of('@','$','#'));
        word = word.toLowerCase();
        boolean[] conditions = new boolean[3];
        int count = 0 ;
        for(int i=0 ; i<word.length() ;i++){
            char curr = word.charAt(i);
            if(symbols.contains(curr)) return false;
            else if(vowels.contains(curr)) {conditions[1]=true;}
            else if('a'<=curr && 'z'>=curr) {conditions[2]=true;}
            count++;
        }
        if(count>=3) conditions[0]=true;
        for(int i=0;i<3;i++){
            //System.out.println(conditions[i]);
            if(!conditions[i]) return false;
        }
        return true;

    }
}