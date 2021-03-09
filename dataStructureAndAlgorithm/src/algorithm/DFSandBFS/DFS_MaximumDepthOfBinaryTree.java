package algorithm.DFSandBFS;

import java.util.Stack;

// DFS(stack)를 활용한 depth 구하기 
public class DFS_MaximumDepthOfBinaryTree {
	public int dfs(TreeNode root) {
		// 1. null 체크
		if(root == null) {
			return 0;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> valueStack = new Stack<Integer>();
		
		stack.push(root);
		valueStack.push(1);
		
		int max = 0;
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			int count = valueStack.pop();
			max = Math.max(max, count);
			
			if(node.left != null) {
				stack.push(node.left);
				valueStack.push(1 + count);
			}
			
			if(node.right != null) {
				stack.push(node.right);
				valueStack.push(1 + count);
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		DFS_MaximumDepthOfBinaryTree a = new DFS_MaximumDepthOfBinaryTree();
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		node.left.left.left = new TreeNode(6);
		
		/*
		 *            1
		 *         2     3
		 *      4    5  
		 *   6
		 */
		
		System.out.println("최대 깊이 : " + a.dfs(node));
	}
}




