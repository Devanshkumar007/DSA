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
    int min = Integer.MAX_VALUE;
    public int traverse(TreeNode root ,int val){
        if(root==null) return min;
        if(val!=root.val) min = Math.min(min , Math.abs(root.val-val));
        traverse(root.left,val);
        traverse(root.right,val);
        return min ;
    }
    public int minDiffInBST(TreeNode root) {
        if(root==null) return Integer.MAX_VALUE;
        traverse(root,root.val);
        minDiffInBST(root.left);
        minDiffInBST(root.right);

        return min ;
    }
}