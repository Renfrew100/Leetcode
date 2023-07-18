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
            
            // **** base case ****
            if (root == null)
                return true;
    
            // **** check if left and right subtrees are balanced ****
            if (Math.abs(height(root.left) - height(root.right)) <= 1 &&
                isBalanced(root.left) &&
                isBalanced(root.right))
                return true;
    
            // **** tree is not balanced ****
            return false;
            
    }
}