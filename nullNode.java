// Definition for a Node.
/*
class nullNode {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public nullNode() {}
    
    public nullNode(int _val) {
        val = _val;
    }

    public nullNode(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
*/
class nullNode{
    public void connect(Node root) {
        //this.root = root;
        if (root == null) {
            return;
        }

        nullNode leftN = root.left;
        nullNode rightN = root.right;

        while(leftN != null) {
            leftN.next = rightN;
            leftN = leftN.right;
            rightN = rightN.left;
        }   

        connect(root.left);
        connect(root.right);
    }
}
