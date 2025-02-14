/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        HashMap<ListNode,Integer> mp = new HashMap<>();
        ListNode temp = headA;
        while(temp!=null){
            mp.put(temp,0);
            temp = temp.next;
        }
        temp = headB;
        while(temp!=null){
            if(mp.containsKey(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
}