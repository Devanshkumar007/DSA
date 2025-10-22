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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1 ;
        ListNode temp2 = l2 ;
        ListNode head = null ;
        ListNode temp = null ;
        while(temp1!=null && temp2!=null){
            if(head==null){
                head= new ListNode((temp1.val+temp2.val)%10);
                carry = (temp1.val+temp2.val)/10 ;
                temp = head;
            }
            else{
                temp.next = new ListNode((temp1.val+temp2.val+carry)%10);
                carry = (temp1.val+temp2.val+carry)/10 ;
                temp = temp.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null ){
            if(head==null){
                head= new ListNode((temp1.val)%10);
                carry = (temp1.val+temp2.val)/10 ;
                temp = head;
            }
            else{
                temp.next = new ListNode((temp1.val+carry)%10);
                carry = (temp1.val+carry)/10 ;
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        while(temp2!=null){
            if(head==null){
                head= new ListNode((temp2.val)%10);
                carry = (temp2.val)/10 ;
                temp = head;
            }
            else{
                temp.next = new ListNode((temp2.val+carry)%10);
                carry = (temp2.val+carry)/10 ;
                temp = temp.next;
            }
            temp2 = temp2.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }

        return head;

    }
}