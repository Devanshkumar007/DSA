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
public void checking(TreeNode root, int targetSum ,List<List<Integer>> ans , List<Integer> inner){
    if(root == null) return;
    inner.add(root.val);
    if(root.left==null && root.right==null && targetSum-root.val==0){ ans.add(new LinkedList<>(inner));}
    else{
        checking(root.left, targetSum-root.val, ans,inner);
        checking(root.right, targetSum-root.val, ans,inner);
    }
    inner.remove(inner.size()-1);
}

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        List<Integer> inner = new ArrayList<>();
        checking(root,targetSum,ans,inner);

        return ans;

    }
}