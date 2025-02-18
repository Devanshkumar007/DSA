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
    ListNode head2 = null ;
    boolean ans = true ;
    public void checking(ListNode head){
        if(head.next==null) return ;
        ListNode curr = head.next ;
        checking(head.next);
        if(head2.val!=curr.val) ans = false;
        head2=head2.next; 
    }
    public boolean isPalindrome(ListNode head) {
        head2=head;
        checking(head);
        return ans;
    }
}