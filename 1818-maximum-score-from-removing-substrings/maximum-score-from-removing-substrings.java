class Solution {
    public int maximumGain(String s, int x, int y) {
        String first,second;
        if(x>y) {first = "ab"; second="ba"; }
        else {first = "ba"; second="ab"; int temp = y ;
        y=x;
        x=temp;
        }
        //System.out.println(first+" "+second);
        Stack<Character> st = new Stack<>();
        //first check for first and then check for second 
        int i = 0 ;
        int score = 0 ;
        
        while(i<s.length()){
            if(!st.isEmpty() && (st.peek() +""+ s.charAt(i)).equals(first)){score+= x; st.pop();}
            else st.push(s.charAt(i));
            i++;
        }
        s = toString(st);
        //System.out.println(s);
        i=0;
        while(i<s.length()){
            if(!st.isEmpty() &&(st.peek() +""+ s.charAt(i)).equals(second)){score+= y; st.pop();}
            else st.push(s.charAt(i));
            i++;
        }

        return score;
    }
    
    
    public String toString(Stack<Character> st){
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}