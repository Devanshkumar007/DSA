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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bst(ArrayList<Integer> nums,int first,int last){
        if(first>last) return null ;
        int mid = (first+last)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = bst(nums,first,mid-1);
        root.right = bst(nums,mid+1,last);

        return root ;
    }

    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head=head.next;
        }
        return bst(nums,0,nums.size()-1);
    }
}