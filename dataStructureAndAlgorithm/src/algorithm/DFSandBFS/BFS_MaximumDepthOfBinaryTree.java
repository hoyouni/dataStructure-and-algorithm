package algorithm.DFSandBFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_MaximumDepthOfBinaryTree {
	public int bfs(TreeNode root) {
		if(root == null) 
			return 0;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		int count = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
			
				if(node.left != null) {
					queue.offer(node.left);
				}
				
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		BFS_MaximumDepthOfBinaryTree a = new BFS_MaximumDepthOfBinaryTree();
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
		
		System.out.println("최대 깊이 : " + a.bfs(node));
	
	}
}









