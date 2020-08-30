package LeetCode.LeetCode150.二叉树的层次遍历II;

import javafx.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

/**
 * 无法保证每一层的原始顺序
 */
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

		levelOrderBottom(node) ;
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		if(root==null){
			return null ;
		}

		List<List<Integer>> result = new ArrayList<>() ;

		Map<TreeNode,Integer> map = new HashMap<>() ;
		int maxDep = 0 ;

		Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>() ;
		queue.add(new Pair(root,1)) ;
		while(!queue.isEmpty()){
			Pair<TreeNode,Integer> p = queue.poll() ;
			TreeNode node = p.getKey() ;
			int nodeDep = p.getValue() ;

			map.put(node,nodeDep) ;

			if(node!=null){
				maxDep = Math.max(maxDep,nodeDep) ;
				if(node.left!=null) {
					queue.add(new Pair(node.left, nodeDep + 1));
				}
				if(node.right!=null){
					queue.add(new Pair(node.right,nodeDep + 1)) ;
				}
			}
		}

		for(int i=maxDep;i>=1;i--){
			List<Integer> l = new ArrayList<>() ;
			for(Map.Entry e:map.entrySet()){
				if((Integer)e.getValue()==i){
					l.add(((TreeNode)e.getKey()).val) ;
				}
			}
			//Collections.sort(l);
			result.add(l) ;
		}

		return result ;
	}
}
