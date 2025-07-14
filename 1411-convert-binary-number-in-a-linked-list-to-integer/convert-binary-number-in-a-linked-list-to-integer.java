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
    int m = 1 ;
    int ans = 0;
    public int getDecimalValue(ListNode head) {
        if (head==null) return ans;
        getDecimalValue(head.next);
        ans = ans + ((head.val)*m);
        m*=2;
    
        return ans ;
    }
}