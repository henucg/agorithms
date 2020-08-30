package LeetCode.LeetCode150.二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test01 {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>() ;
		if(root==null){
			return list ;
		}

		Queue<TreeNode> queue = new LinkedList<>() ;
		queue.add(root) ;
		while(!queue.isEmpty()){
			int size = queue.size() ;
			List<Integer> l = new ArrayList<>() ;
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
			list.add(l) ;
		}
		return list ;
	}
}
