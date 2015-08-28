// Problem definition:
// Given a binary tree, return the preorder traversal of its nodes' values;

// Recursive solutions are simple and short:

public class BinaryTreePreorderTraversal{
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root){
		if(root == null) return list;
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
	}
}

/* An iterative solution is also not hard to implement, and much straightforward than the recursive one. The solution below
   would use a stack to maintain the rightchild of the nodes. After the left nodes are traversed, the right ones are popped 
   according to "first in last out" rules.
*/
   
public class BinaryTreePreorderTraversal{
    public List<Integer> preorderTraversal(TreeNode root){
    	List<Integer> list = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(root != null){
    		list.add(root.val);
    		if(root.right != null) stack.push(root.right);
    		root = root.left;
    		if(root == null && !stack.isEmpty()){
    			root = stack.pop();
    		}
    	}
    	return list;
    }
}

public class BinaryTreePreorderTraversal{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            lsit.add(root.val);
            if(root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        return list;
    }
}
