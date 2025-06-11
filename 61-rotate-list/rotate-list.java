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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        if(k==0) return head;
        int count = 1 ;
        ListNode temp = head;
        while(temp.next!=null){
            count++ ; temp = temp.next;
        }
        k = k % count ;
        if(k==0) return head;
        ListNode ans = null ;
        k = count - k ;
        count = 1 ;
        ListNode temp2 = head ;
        while(count!=k){
            temp2 = temp2.next ;
            count++;
        }
        ans = temp2.next;
        temp2.next = null ;
        temp.next = head ;
        return ans ;
    }
}