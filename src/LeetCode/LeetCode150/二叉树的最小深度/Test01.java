package LeetCode.LeetCode150.二叉树的最小深度;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1) ;
		TreeNode node2 = new TreeNode(2) ;
		TreeNode node3 = new TreeNode(3) ;

		node1.left = node2 ;
		node2.right = node3 ;

		System.out.println(minDepth(node1));
	}

	public static int minDepth(TreeNode root) {
		if(root==null){
			return 0 ;
		}

		Queue<TreeNode> q = new LinkedList<>() ;
		q.add(root) ;
		int dep = 0 ;
		while(!q.isEmpty()){
			int size = q.size() ;
			dep++ ;
			for(int i=0;i<size;i++){
				TreeNode node = q.poll() ;
				if(node.left==null && node.right==null){
					return dep ;
				}

				if(node.left!=null){
					q.add(node.left) ;
				}
				if(node.right!=null){
					q.add(node.right) ;
				}
			}
		}

		return dep ;
	}
}
