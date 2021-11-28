public class binaryTree{
      int val;
      binaryTree left;
      binaryTree right;
      binaryTree() {}
      binaryTree(int val) { this.val = val; }
      binaryTree(int val, binaryTree left, binaryTree right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    class binaryTreeTraversal{
        //in order traversal (LVR)
        void inOrderTraversal(binaryTree node){
            if(node != null){
                inOrderTraversal(node.left);
                //visit(node);
                inOrderTraversal(node.right);
            }
        }
        //pre order traversal (VLR)
        void preOrderTraversal(binaryTree node){
            if(node != null){
                //visit(node);
                preOrderTraversal(node.left);
                preOrderTraversal(node.right);
            }
        }
        //post order traversal LRV
        void postOrderTraversal(binaryTree node){
            if(node != null){
                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                //visit(node);
            }
        }
    }