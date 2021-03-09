package algorithm.StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
	}
}

public class BinaryTreeLevelOrder {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(7);
		System.out.println(solve(root));
	}
	
	public static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(root == null)
			return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		//
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new LinkedList<>();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				
				if(node.left != null) {
					queue.offer(node.left);
				}
				
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			result.add(list);
		}
		
		return result;
	}
}
