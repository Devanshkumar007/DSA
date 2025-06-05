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
    public TreeNode bst(int[] nums , int first, int last){
        if(first>last) return null;
        int mid = (first + last) / 2 ;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = bst(nums,first,mid-1);
        curr.right = bst(nums,mid+1,last);
        
        return curr;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1) ;
    }
}