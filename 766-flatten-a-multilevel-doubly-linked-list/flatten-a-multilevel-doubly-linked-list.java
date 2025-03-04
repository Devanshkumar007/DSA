/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head ;
        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null) st.push(temp.next);
                temp.next=temp.child;
                Node children =temp.child;
                children.prev=temp;
                temp.child=null;
            }
            if(!st.isEmpty() && temp.next ==null){
                temp.next=st.pop();
                Node forward = temp.next;
                forward.prev = temp;
            }
            temp= temp.next;
        }
        return head;
    }
}