package LeetCode150.二叉树展开为链表;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1) ;
		TreeNode node2 = new TreeNode(2) ;
		TreeNode node3 = new TreeNode(3) ;
		TreeNode node4 = new TreeNode(4) ;
		TreeNode node5 = new TreeNode(5) ;

		node1.left = node2 ;
		node1.right = node5 ;
		node2.left = node3 ;
		node2.right = node4 ;

		flatten(node1);
	}

	public static void flatten(TreeNode root) {
		if(root==null){
			return;
		}

		Stack<TreeNode> q = new Stack<>() ;
		q.add(root) ;
		TreeNode rootNode = null ;
		TreeNode treeNode = null ;
		while(!q.isEmpty()){
			TreeNode node = q.pop() ;
			if(rootNode==null){
				rootNode = node ;
				treeNode = node ;
			}else{
				treeNode.right = node ;
				treeNode = node ;
			}
			if(node.right!=null){
				q.push(node.right) ;
			}
			if(node.left!=null){
				q.push(node.left) ;
			}
			node.left = null ;
		}
		root = treeNode ;
	}
}
