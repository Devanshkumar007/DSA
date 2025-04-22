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
    public int countNodes(TreeNode root){
        if(root==null) return 0 ;
        return 1 + countNodes(root.left)+countNodes(root.right);
    }

    public boolean check(TreeNode root, int i, int nodes){
        if(root==null) return true ;
        if(i>=nodes+1) return false ;
        return check(root.left,2*i,nodes) && check(root.right,(2*i)+1,nodes);

    }

    public boolean isCompleteTree(TreeNode root) {
        int nodes = countNodes(root);
        return check(root,1,nodes);
        
    }
}