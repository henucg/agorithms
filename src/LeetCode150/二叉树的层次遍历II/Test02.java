package LeetCode150.二叉树的层次遍历II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

		levelOrderBottom(node) ;
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>() ;
		if(root==null){
			return result ;
		}

		Queue<TreeNode> queue = new LinkedList<>() ;
		queue.add(root) ;
		while(!queue.isEmpty()){
			List<Integer> l = new ArrayList<>() ;
			int size = queue.size() ;
			for(int i=0;i<size;i++){
				TreeNode node = queue.poll() ;
				l.add(node.val) ;

				if(node.left!=null){
					queue.add(node.left) ;
				}
				if(node.right!=null){
					queue.add(node.right) ;
				}
			}
			result.add(0,l) ;
		}

		return result ;
	}
}
