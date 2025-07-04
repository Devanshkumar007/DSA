/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int z = 0;
        int o = 0;
        int t = 0;
        Node temp = head ;
        while(temp!=null){
            if(temp.data==0) z++;
            else if(temp.data==1) o++;
            else if(temp.data==2) t++;
            temp=temp.next;
        }
        temp=head;
        while(z!=0) { temp.data=0; temp=temp.next; z--;}
        while(o!=0) { temp.data=1; temp=temp.next; o--;}
        while(t!=0) { temp.data=2; temp=temp.next; t--;}
        
        return head;
    }
}