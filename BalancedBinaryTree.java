// Problem definition:
// Given a binary tree, determine if it is height-balanced.
/* A height-balanced binary tree is defined as a binary tree 
   in which the depth of the two subtrees of every node never differ by more than 1.
*/

public class BalancedBinaryTree{
	public boolean isBalanced(TreeNode root){
		if(root == null) return true;
		if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
		return isBalanced(root.left) && isBalanced(root.right);                 // recursively check if the node is balanced;
	}
	private int height(TreeNode node){                                          // return the height of subtree;
		if(node == null) return 0;
		return Math.max(height(node.left), height(node.right)) + 1;
	}
}