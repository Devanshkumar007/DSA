class Solution { 
    int min = Integer.MAX_VALUE;
    public int traverse(TreeNode root ,int val){
        if(root==null) return min;
        if(val!=root.val) min = Math.min(min , Math.abs(root.val-val));
        traverse(root.left,val);
        traverse(root.right,val);
        return min ;
    }
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return Integer.MAX_VALUE;
        traverse(root,root.val);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);

        return min ;
    }
}


