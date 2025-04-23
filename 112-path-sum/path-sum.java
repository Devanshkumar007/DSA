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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return flag;
        if(root.left==null && root.right==null && targetSum-root.val==0) flag = true;
        hasPathSum(root.left,targetSum-root.val);
        hasPathSum(root.right,targetSum-root.val);
        return flag;
    }
}