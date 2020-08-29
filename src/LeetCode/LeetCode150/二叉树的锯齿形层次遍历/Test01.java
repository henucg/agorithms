package LeetCode150.二叉树的锯齿形层次遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test01 {
	public static void main(String[] args) {

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>() ;
		if(root==null){
			return list ;
		}

		Queue<TreeNode> queue = new LinkedList<>() ;
		queue.add(root) ;
		boolean flag = true ;
		while(!queue.isEmpty()){
			List<Integer> l = new ArrayList<>() ;
			int size = queue.size() ;
			for(int i=0;i<size;i++){
				TreeNode node = queue.poll() ;
				if(flag) {
					l.add(node.val);
				}else{
					l.add(0,node.val);
				}

				if(node.left!=null){
					queue.add(node.left) ;
				}
				if(node.right!=null){
					queue.add(node.right) ;
				}
			}
			list.add(l) ;
			flag = !flag ;
		}
		return list ;
	}
}
