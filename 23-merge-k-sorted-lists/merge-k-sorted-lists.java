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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0 ; i<lists.length ; i++){
            ListNode temp = lists[i];
            while(temp!=null){
                ls.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head = null ;
        Collections.sort(ls);
        int i= 0 ;
        ListNode temp = null ;
        while(i<ls.size()){
            if(head==null){
              head=new ListNode(ls.get(i));
              temp=head;
            }
            else{
                temp.next = new ListNode(ls.get(i));
                temp = temp.next ;
            }
            i++;
        }

        return head;

    }
}