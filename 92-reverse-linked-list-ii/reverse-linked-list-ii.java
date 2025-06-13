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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) return head ;
        ListNode prev= null ;
        ListNode curr = head ;
        for(int i=1 ; i<left ; i++){
            prev = curr ;
            curr = curr.next ;
        }
        Stack<ListNode> st = new Stack<>();
        for(int i = left ; i<=right ; i++){
            st.push(curr);
            curr=curr.next;
        }

        ListNode end  = st.peek().next ;
        if(prev==null){head=st.peek();}
        else prev.next = st.peek();
        prev = st.peek() ;

        while(!st.isEmpty()){
            prev.next = st.pop();
            prev = prev.next;
        }
        prev.next = end ;

        return head;
    }
}