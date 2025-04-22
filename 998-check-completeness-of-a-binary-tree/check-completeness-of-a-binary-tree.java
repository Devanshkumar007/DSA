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

    public void check(TreeNode root, int i, int[] arr){
        if(root==null) return;
        if(i>=arr.length) return ;
        arr[i]=1; //System.out.println(i);
        check(root.left,2*i,arr);
        check(root.right,(2*i)+1,arr);

    }

    public boolean isCompleteTree(TreeNode root) {
        int nodes = countNodes(root);
        int[] arr = new int[nodes+1];
        check(root,1,arr);
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==0) return false;
            //System.out.println(i);
        }
        return true;


    }
}