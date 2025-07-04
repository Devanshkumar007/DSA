/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca = null ;
    boolean pf, qf = false ;
    public void checking(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return ;
        if(root==p) pf=true;
        if(root==q) qf=true;
        checking(root.left,p,q);
        checking(root.right,p,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        checking(root,p,q);
        if(pf && qf) lca = root; 
        
        pf=false ; qf = false;
        lowestCommonAncestor(root.left,p,q);
        lowestCommonAncestor(root.right,p,q);


        return lca;
    }
}