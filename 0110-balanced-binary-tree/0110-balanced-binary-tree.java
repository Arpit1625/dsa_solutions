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
        if(root == null) return true;
        return isBal(root) != -1;
    }
    private int isBal(TreeNode root){
        if(root == null) return 0;
        int left = isBal(root.left);
        if(left == -1) return - 1;
        int right = isBal(root.right);
        if (right == -1) return -1;

        int diff = Math.abs(left - right);
        if(diff > 1) return - 1;

        return 1 + Math.max(left , right);
    }
}