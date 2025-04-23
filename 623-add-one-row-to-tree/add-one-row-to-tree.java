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
    public void ans(TreeNode root, int val, int depth , int curr){
        if(root==null) return ;
        if(depth==curr){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(val,left,null);
            root.right = new TreeNode(val,null,right);
            return;
        }
        ans(root.left,val,depth,curr+1);
        ans(root.right,val,depth,curr+1);
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode first = new TreeNode(val,root,null);
            return first;
        }
        ans(root,val,depth-1,1);
        return root;
    }
}