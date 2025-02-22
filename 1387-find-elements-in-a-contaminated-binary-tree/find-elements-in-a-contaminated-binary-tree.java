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
class FindElements {
    TreeMap<Integer,Boolean> mp ;
    public FindElements(TreeNode root) {
        mp = new TreeMap<>();
        dfs(root,mp,0);
    }

    public void dfs(TreeNode root,TreeMap<Integer,Boolean> mp, int i){
        if(root==null) {mp.put(i,false); return;}
        mp.put(i,true);
        dfs(root.left,mp,(2*i)+1);
        dfs(root.right,mp,(2*i)+2);
    }
    
    public boolean find(int target) {
        return mp.containsKey(target) ? mp.get(target) : false;

    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */