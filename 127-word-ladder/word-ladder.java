class Pair{
    String word;
    int level;
    Pair(String word, int level){
        this.word=word; this.level=level;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs = new HashSet<>(wordList);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        if(!hs.contains(endWord)) return 0 ;
        while(!q.isEmpty()){
            String word = q.peek().word;
            int lvl = q.peek().level;
            q.remove();
            for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (c != word.charAt(i)) {
                    StringBuilder newWord = new StringBuilder(word);
                    newWord.setCharAt(i, c);
                    String check = newWord.toString();
                    if(hs.contains(check)){
                        if(check.equals(endWord)) return lvl+1;
                        q.add(new Pair(check , lvl+1));
                        hs.remove(check);
                    }
                }
            }
        }
    }
        return 0 ;
    }
}