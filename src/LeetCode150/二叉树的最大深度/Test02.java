package LeetCode150.二叉树的最大深度;

import javafx.util.Pair;

import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1) ;

		TreeNode l1 = new TreeNode(2) ;
		TreeNode r1 = new TreeNode(3) ;

		TreeNode r1l2 = new TreeNode(4) ;
		TreeNode r1r2 = new TreeNode(5) ;

		node.left = l1 ;
		node.right = r1 ;

		l1.left = r1l2 ;
		r1.right = r1r2 ;

		System.out.println(maxDepth(node));
	}

	public static int maxDepth(TreeNode root) {
		if(root==null){
			return 0 ;
		}else{
			int leftDep = maxDepth(root.left) ;
			int rightDep = maxDepth(root.right) ;

			return Math.max(leftDep,rightDep) + 1 ;
		}
	}
}
