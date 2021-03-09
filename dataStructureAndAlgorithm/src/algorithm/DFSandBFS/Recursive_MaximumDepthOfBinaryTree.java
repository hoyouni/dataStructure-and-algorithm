package algorithm.DFSandBFS;

// 이진 트리의 최대 깊이 찾기 (재귀 호출)
/*
 * 1. left, right 호출
 * 2. Math.max(leftMax, rightMax) 이용
 */

class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		this.val = x;
	}
} // TreeNode

public class Recursive_MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		//System.out.println(root.val);
		int leftMax = maxDepth(root.left);
		int rightMax = maxDepth(root.right);
		
		return Math.max(leftMax, rightMax) + 1;
	}
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(4);
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(8);
		tree.left.left.left = new TreeNode(7);
		
		Recursive_MaximumDepthOfBinaryTree a = new Recursive_MaximumDepthOfBinaryTree();
		System.out.println(a.maxDepth(tree));
	}
}




