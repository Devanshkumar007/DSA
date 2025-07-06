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
    boolean fflag = true ;
    public void traverse(TreeNode root, Boolean flag){
        if(root==null || !fflag ) return; 
        if(flag && root.left==root.right) hs.add(root.val);
        if(!flag && root.left==root.right) {
            if( hs.size() >0 && hs.get(0)==root.val ) hs.remove(0);
            else fflag = false ;
        }

        traverse(root.left , flag);
        traverse(root.right , flag);
        
    }
    List<Integer> hs = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1, true);    
        traverse(root2, false);
        if(hs.size()!=0) fflag= false ;
        return fflag;    
    }
}