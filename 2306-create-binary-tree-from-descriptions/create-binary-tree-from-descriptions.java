class Pair {
    int left, right;
    Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode bst(HashMap<Integer, Pair> child, int parent) {
        if (!child.containsKey(parent)) return new TreeNode(parent);
        TreeNode root = new TreeNode(parent);
        int left = child.get(parent).left;
        int right = child.get(parent).right;
        root.left = (left == -1) ? null : bst(child, left);
        root.right = (right == -1) ? null : bst(child, right);
        return root;
    }

    public TreeNode createBinaryTree(int[][] desc) {
        HashSet<Integer> parent = new HashSet<>();
        HashSet<Integer> chld = new HashSet<>();
        HashMap<Integer, Pair> child = new HashMap<>();

        for (int[] row : desc) {
            int par = row[0], chi = row[1], isLeft = row[2];
            parent.add(par);
            chld.add(chi);

            Pair prev = child.getOrDefault(par, new Pair(-1, -1));
            if (isLeft == 1) prev.left = chi;
            else prev.right = chi;
            child.put(par, prev);
        }

        // Remove all child nodes from parent set
        for (int i : chld) {
            parent.remove(i);
        }

        // The remaining node is the root
        int rootVal = parent.iterator().next(); // guaranteed one root
        return bst(child, rootVal);
    }
}
