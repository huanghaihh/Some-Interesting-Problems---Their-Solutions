// problem definition:
// Given a binary tree, return the inorder traversal of its nodes' values.

// recursive solution:

public class BinaryTreeInorderTraversal {
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}

// Iterative solution:

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	if(root == null) return list;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(root != null || !stack.isEmpty()){
    		while(root != null){
    			stack.push(root);
    			root = root.left;
    		}
    		root = stack.pop();
    		list.add(root.val);
    		root = root.right;
    	}
    	return list;
    }
}
