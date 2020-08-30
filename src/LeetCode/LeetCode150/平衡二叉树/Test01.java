package LeetCode.LeetCode150.平衡二叉树;

public class Test01 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1) ;

		TreeNode node2 = new TreeNode(2) ;
		TreeNode node3 = new TreeNode(2) ;

		TreeNode node4 = new TreeNode(3) ;
		TreeNode node5 = new TreeNode(3) ;

		TreeNode node6 = new TreeNode(4) ;
		TreeNode node7 = new TreeNode(4) ;

		node1.left = node2 ;
		node1.right = node3 ;

		node2.left = node4 ;
		node2.right = node5 ;

		node4.left = node6 ;
		node4.right = node7 ;

		isBalanced(node1) ;
	}

	public static boolean isBalanced(TreeNode root) {
		if(root==null){
			return true ;
		}

		return Math.abs(isBalance(root.left) - isBalance(root.right)) < 2
				&& isBalanced(root.left)
				&& isBalanced(root.right);
	}

	public static int isBalance(TreeNode node){
		if (node == null) {
			return -1;
		}
		return 1 + Math.max(isBalance(node.left), isBalance(node.right));
	}
}
