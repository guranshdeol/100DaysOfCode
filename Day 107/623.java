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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        
        insertAtDepth(root, val, 1, depth);
        return root;
    }
    
    private void insertAtDepth(TreeNode node, int val, int currentDepth, int targetDepth) {
        if (node == null) return;
        
        if (currentDepth == targetDepth - 1) {
            TreeNode tempLeft = node.left;
            TreeNode tempRight = node.right;
            node.left = new TreeNode(val, tempLeft, null);
            node.right = new TreeNode(val, null, tempRight);
        } else {
            insertAtDepth(node.left, val, currentDepth + 1, targetDepth);
            insertAtDepth(node.right, val, currentDepth + 1, targetDepth);
        }
    }
}