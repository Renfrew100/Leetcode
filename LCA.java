/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LCA {
    public int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return false;
        }
            if(p.val > root.val && q.val > root.val){   
                return root.val;
            }
            else{
                return false;
            }
            
    }
}