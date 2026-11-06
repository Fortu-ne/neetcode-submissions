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

   public boolean isBalanced(TreeNode root) {
    // dfs returns -1 if unbalanced, otherwise returns height
    return dfs(root) != -1;
}

private int dfs(TreeNode node) {
    if (node == null) return 0; // base case: height of null node is 0

    int leftHeight = dfs(node.left);
    if (leftHeight == -1) return -1; // left subtree is unbalanced

    int rightHeight = dfs(node.right);
    if (rightHeight == -1) return -1; // right subtree is unbalanced

    if (Math.abs(leftHeight - rightHeight) > 1) return -1; // current node is unbalanced

    return 1 + Math.max(leftHeight, rightHeight); // height of current node
}

}
