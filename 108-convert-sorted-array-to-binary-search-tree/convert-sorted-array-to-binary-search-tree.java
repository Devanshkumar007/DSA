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
    public TreeNode bst(int[] nums, int first , int last){
        if(first > last) return null;
        int mid = (first+last)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums, first , mid-1);
        root.right = bst(nums, mid+1 , last);

        return root ;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
}