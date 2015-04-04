// Proble definition:
// Given a binary tree, return the postorder traversal of its nodes' values.

// Recursive solution:

public class BinaryTreePostorderTraversal{
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> postorderTraversal(TreeNode root){
		if(root == null) return list;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		list.add(root.val);
		return list;
	}
}

/* Iterative solution seems a little tricky, but we can 
   first traversal the tree in an order of "node, node.right, node.left".
   Then we can reverse the result list and we get the postorder traversal.
*/

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null){
        	list.add(root.val);                               // visit the node itself
        	if(root.left != null) stack.push(root.left);      // store the node.left, which will be traverse at the end
        	root = root.right;                                // visit the node.right if it is not null
        	if(root == null && !stack.isEmpty()){             // if node.right is null. then pop the node.left and visit it
        		root = stack.pop();
        	}
        }
        Collections.reverse(list);                            // reverse the result in the end.
        return list;
    }
}