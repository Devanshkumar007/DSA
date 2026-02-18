class Pair{
    int freq;
    char c ;
    Pair(char c, int f){
        this.freq=f;
        this.c=c;
    }

    public boolean equals(Object p){
        Pair p1 = (Pair) p ;
        return this.c == p1.c;
    }

    public int hashCode(){
        return Objects.hash(c);
    }

    public String toString(){
        return c+" "+freq;
    }
}
class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Pair> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.computeIfAbsent(ch, k -> new Pair(k, 0)).freq++;
        }

        // System.out.println(map.values());
        
        ArrayList<Pair> ls = new ArrayList<>(map.values());
        Collections.sort(ls, (a,b)-> Integer.compare(b.freq,a.freq));
        // System.out.println(ls);

        StringBuilder sb =new StringBuilder();
        for(int i=0;i<ls.size(); i++){
            for(int j=0;j<ls.get(i).freq ; j++){
                sb.append(ls.get(i).c);
            }
        }

        
        return sb.toString();    


    }
}