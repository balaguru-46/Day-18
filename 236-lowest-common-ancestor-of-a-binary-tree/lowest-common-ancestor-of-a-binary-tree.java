class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: empty tree or found p/q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides return a node, current node is LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null side
        return left != null ? left : right;
    }
}