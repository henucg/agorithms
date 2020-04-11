package LeetCode150.二叉树的最大深度;

import javafx.util.Pair;

import java.util.Stack;

public class Test01 {
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
		Stack<Pair<TreeNode,Integer>> stack = new Stack<>() ;
		stack.push(new Pair(root,1)) ;

		int maxDep = 0 ;
		while(!stack.empty()){
			Pair<TreeNode,Integer> p = stack.pop() ;
			TreeNode node = p.getKey() ;
			int nodeDep = p.getValue() ;
			if(node!=null){
				maxDep = Math.max(maxDep,nodeDep) ;
				if(node.left!=null) {
					stack.push(new Pair(node.left, nodeDep + 1));
				}
				if(node.right!=null) {
					stack.push(new Pair(node.right, nodeDep + 1));
				}
			}
		}
		return maxDep ;
	}
}
