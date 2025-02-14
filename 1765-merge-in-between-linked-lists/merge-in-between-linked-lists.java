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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1 ;
        int count = -1 ;
        a--; b++; 
        ListNode ap=null ;
        ListNode bp=null ;
        while(temp!=null){
            count++;
            if(count==a) ap = temp;
            if(count==b) bp = temp;
            temp = temp.next;
        }
        ap.next = list2;
        temp = list2; 
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = bp ;
        
        return list1 ;
}
}