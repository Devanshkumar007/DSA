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
    TreeNode ans = null;
    TreeNode temp = null;
    public void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        if(ans==null){ans=root ; temp=ans;}
        else{
            temp.right = root;
            root.left=null;
            temp = root;
        }
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return ans;
    }
}