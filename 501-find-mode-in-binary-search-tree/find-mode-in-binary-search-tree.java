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
    public void traverse( TreeNode root, HashMap<Integer,Integer> hs ){
        if(root==null) return;
        hs.put(root.val, hs.getOrDefault(root.val, 0) + 1);

        traverse(root.left,hs);
        traverse(root.right,hs);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        traverse(root,hs);
        int mode = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : hs.keySet()){
            mode = mode < hs.get(i) ? hs.get(i) : mode ;
        }
        for(int i : hs.keySet()){
            if(mode==hs.get(i)) ans.add(i);
        }

        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}