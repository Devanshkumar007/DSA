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
    public boolean flag = false;
    public void checking(int sum, TreeNode root, int target){
        if(root==null) return;
        if(sum+root.val==target && root.left==null && root.right==null) flag = true;
        checking(sum+root.val,root.left,target);
        checking(sum+root.val,root.right,target);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        checking(0,root,targetSum);
        return flag;
    }
}