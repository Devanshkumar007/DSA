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
    boolean flag = true;
    public void check(ListNode head){
        if(head==null) return ;
        ListNode temp = head ;
        check(head.next);
        if(temp.val==head2.val) head2=head2.next;
        else flag=false;
    }
    public boolean isPalindrome(ListNode head) {
        head2= head ;
        check(head);
        return flag ;
    }
}