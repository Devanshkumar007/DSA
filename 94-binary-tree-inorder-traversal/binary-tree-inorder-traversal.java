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
class Pair{
    TreeNode curr;
    int rep;
    Pair(TreeNode curr , int rep){
        this.curr= curr ;
        this.rep = rep;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new LinkedList<>();
        if(root==null) return inorder ;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));

        while(!st.isEmpty()){
            TreeNode curr = st.peek().curr;
            int rep = st.peek().rep;
            st.pop();
            if(rep==1){
                rep++;
                st.push(new Pair(curr,rep));
                if(curr.left!=null) st.push(new Pair(curr.left,1));
            }else if(rep==2){
                rep++;
                st.push(new Pair(curr,rep));
                if(curr.right!=null) st.push(new Pair(curr.right,1));
                inorder.add(curr.val);
            }
        }

        return inorder;

    }
}