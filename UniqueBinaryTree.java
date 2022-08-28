import java.io.*;
import java.util.Arrays;

public class UniqueBinaryTree {
	public static void main(String[] args){
        
		public static int dp[] = new int[20];
		static int numberOfBST(int n)
		{
			// Base case
			if (n <= 1)
				return 1;
			// In case if the value is already present in the
			// array just return it and no need to calculate it
			if (dp[n]>0)
				return dp[n];
			for (int i = 1; i <= n; i++)
				dp[n] += numberOfBST(i - 1) * numberOfBST(n - i);
			return dp[n];
		}
	 
			int n = 3;
			//System.out.println("Number of structurally " + "Unique BST with " + n" keys are : " + numberOfBST(n));
	}
    }
    public class TreeNode {
        String data; 
		TreeNode left, right; 
		TreeNode(String value) { 
			this.data = value; 
			left = right = null; 
			} 
		boolean isLeaf() { 
			return left == null ? right == null : false; 
			} 
		} 
	// root of binary tree 
	TreeNode root; 
	
	/** * Java method to print tree nodes in PreOrder traversal */ 
	public void preOrder() { 
		preOrder(root); 
		}
	
	/** * write a function to traverse the binary tree in PreOrder */

	private void preOrder(TreeNode node) {
		if (node == null) { 
			return; 
			} 
		System.out.printf("%s ", node.data); 
		preOrder(node.left); 
		preOrder(node.right); 
		} 
	
	public void InOrder() {
	    InOrder(root);
	}
	
	/** * write a function to traverse the binary tree in InOrder */
	private void InOrder(TreeNode node) {
	    if (node == null) {
	      return;
	    }

	    InOrder(node.left);
	    System.out.printf("%s ", node.data);
	    InOrder(node.right);
	}
	
	
	public void PostOrder() {
	    PostOrder(root);
	  }
	
	/** * write a function to traverse the binary tree in PostOrder */

	  private void PostOrder(TreeNode node) {
	    if (node == null) {
	      return;
	    }

	    PostOrder(node.left);
	    PostOrder(node.right);
	    System.out.printf("%s ", node.data);
	  }
	  
	  
	/** * write a function to print leaves from left to right */  
	 public static void printLeaves(TreeNode node) {
		    // base case
		    if (node == null) {
		      return;
		    }

		    if (node.isLeaf()) {
		      System.out.printf("%s ", node.data);
		    }

		    printLeaves(node.left);
		    printLeaves(node.right);

		  }
    }
