package LeetCode150.对称二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Test02 {

	public static void main(String[] args) {

	}

	public static boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> list = new LinkedList<>() ;
		list.add(root) ;
		list.add(root) ;

		while(!list.isEmpty()){
			TreeNode node1 = list.poll() ;
			TreeNode node2 = list.poll() ;

			if(node1==null && node2==null){
				continue;
			}
			if(node1==null || node2==null){
				return false ;
			}
			if(node1.val!=node2.val){
				return false ;
			}

			list.add(node1.left) ;
			list.add(node2.right) ;

			list.add(node1.right) ;
			list.add(node2.left) ;
		}

		return true ;
	}
}
