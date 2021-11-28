public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
 
class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode curr = new TreeNode();
        TreeNode next = new TreeNode();

        TreeNode curr1 = new TreeNode();
        TreeNode next1 = new TreeNode();

        if(curr != null && next != null) {
            if(root.val == 1){
                System.out.println("1");
            }
            else if(root.val == "")
                System.out.println("");
            }
            if(root.node.left != null) { //traverse to the left
                curr = root.node.left;
                next = root.node.right;
            }
            else if(root.node.right != null) { //traverse to the right
                curr = root.node.right;
                next = root.node.left;
            }
            else{
                curr = null;
                next = null;
            }
        }
}