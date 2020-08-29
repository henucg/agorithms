package LeetCode150.路径总和II;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<>() ;
		if(root==null){
			return list ;
		}

		List<Integer> l = new ArrayList<>() ;
		getPath(root,sum,0,list,l) ;
		return list ;
	}

	public static void getPath(TreeNode node,int sum,int depSum,List<List<Integer>> list,List<Integer> l){
		depSum += node.val ;
		l.add(node.val) ;
		if(node.left==null && node.right==null){
			if(depSum==sum){
				list.add(new ArrayList<>(l)) ;
			}
			l.remove(l.size()-1) ;
		}else{
			if(node.left!=null){
				getPath(node.left,sum,depSum,list,l) ;
			}
			if(node.right!=null){
				getPath(node.right,sum,depSum,list,l) ;
			}
			l.remove(l.size()-1) ;
		}
	}
}
