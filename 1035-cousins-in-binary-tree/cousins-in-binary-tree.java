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
    int lvlx = 0 ;
    int lvly = 0;
    boolean flag = true;
    public void check(TreeNode root, int x, int y, int depth){
        if(root==null) return;
        if((root.left!=null && root.right!=null) &&
        (root.left.val==x|| root.right.val==x) && (root.left.val==y||root.right.val==y)) flag= false;
        if(root.val==x) lvlx = depth;
        if(root.val==y) lvly = depth;
        check(root.left,x,y,depth+1);
        check(root.right,x,y,depth+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        check(root,x,y,0);
        if(lvlx!=lvly) return false;
        return flag;
    }
}