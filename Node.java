/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  
*/
//The Node class is defined as follows:
{
class Node {
        int data;
        Node left;
        Node right;
     
    boolean checkBST(Node root) {
        if(root.data < right.data && root.data > left.data){
            checkBST(root.data);
            return true;
        }
    return false;
    }
}