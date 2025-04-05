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
    int ans = 0 ;
    public void height(TreeNode root , int height){
        if(root==null){
            ans = Math.max(ans,height);
            return;
        }
        height(root.left,height+1);
        height(root.right,height+1);
    }

    public int maxDepth(TreeNode root) {
        height(root,0);
        return ans;
    }
}