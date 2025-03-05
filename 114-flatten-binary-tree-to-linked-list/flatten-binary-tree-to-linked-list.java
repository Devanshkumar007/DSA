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
    public void preorder(TreeNode root){

    }
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(temp!=null){
            if(temp.left!=null) {
               if(temp.right!=null) st.push(temp.right);
                temp.right = temp.left;
                temp.left=null;
            }
            if(!st.isEmpty() && temp.right==null && temp.left==null){
                temp.right=st.pop();
            }
            temp=temp.right;
        }

    }
}