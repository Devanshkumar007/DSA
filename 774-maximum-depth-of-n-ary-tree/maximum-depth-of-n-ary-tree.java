/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int height = 1;
        Queue<Node> st = new LinkedList<>();
        st.add(root);
        st.add(null);
        
        while(!st.isEmpty()){
            Node curr ;
            if(st.peek()!=null) {
                int val = st.peek().val;
                List<Node> child = st.peek().children ;
                curr = new Node(val,child);
            }
            else curr = null;
            st.remove();
            if(curr==null){
                if(!st.isEmpty()){
                    st.add(null);
                    height++;
                }
            }else{
                if(curr.children.size()!=0){
                    for(int i=0 ; i<curr.children.size() ; i++){
                        st.add(curr.children.get(i));
                    }
                }
            }
        }

        return height;
    }
}