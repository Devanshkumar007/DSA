class Solution {
    public String simplifyPath(String pat) {
        String[] path = pat.split("/");
        Stack<String> st = new Stack<>();
        for(int i=1; i<path.length; i++){
            if(path[i].equals("")) continue ;
            if( path[i].equals("..")) { if(!st.isEmpty()) st.pop(); }
            else if(! (path[i].equals(".") ) ) st.push(path[i]);
        }

        StringBuilder sb= new StringBuilder();
        if(st.size()==0) sb.append("/");
        while(!st.isEmpty()) sb.insert(0,"/"+st.pop());

        return sb.toString();

        
    }
}