/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(Stack<ListNode> st , ListNode temp1 , ListNode prev){
        ListNode inner = st.pop();
        if(prev!=null)prev.next = inner; 

        while(!st.isEmpty()){
            inner.next = st.pop();
            inner = inner.next;
        }
        
        inner.next= temp1;
        return inner;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head ;
        Stack<ListNode> st = new Stack<>();
        int i = 0 ;
        ListNode prev = null;
        while(temp!=null){
            i++; st.add(temp);
            temp=temp.next;
            if(i%k == 0){
                if(i==k) head = st.peek();
                prev = rev(st,temp,prev);
                // System.out.println(prev.val);
            }
        }
        return head;
    }
}