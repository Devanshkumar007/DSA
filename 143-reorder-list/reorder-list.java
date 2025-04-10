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
    ListNode root= null;
    Boolean flag = false ;
    public void trial(ListNode head) {
        if (head == null) return;
        ListNode temp = head;
        trial(head.next);
        if (flag) return;
    //root=temp (odd) root.next=temp (even)
        if (root == temp || root.next == temp) {
            if (root == temp) root.next = null; 
            else temp.next = null;
        flag = true;
        return;
    }

    ListNode next = root.next;
    root.next = temp;
    temp.next = next;
    root = next;
}

    public void reorderList(ListNode head) {
        if(head==null) return;
        root=head;
        trial(head);
    }
}