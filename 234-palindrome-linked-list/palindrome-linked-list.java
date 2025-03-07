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
    public boolean checking(ListNode head){
        if(head==null) return true ;
        boolean ans = checking(head.next) && (head2.val==head.val);
        head2=head2.next;
        return ans ; 
    }
    public boolean isPalindrome(ListNode head) {
        head2=head;
        return checking(head);
    }
}