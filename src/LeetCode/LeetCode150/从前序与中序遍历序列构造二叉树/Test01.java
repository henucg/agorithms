package LeetCode.LeetCode150.从前序与中序遍历序列构造二叉树;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	Map<Integer,Integer> map = new HashMap() ;
	int preorderIndex = 0 ;
	int[] preorder ;
	int[] inorder ;

	public static void main(String[] args) {
		Test01 t = new Test01() ;
		t.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7}) ;
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder ;
		this.inorder = inorder ;

		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i],i) ;
		}

		return getTreeNode(0,preorder.length-1) ;
	}

	public TreeNode getTreeNode(int left_index,int right_index){
		if(left_index>right_index){
			return null ;
		}

		int rootVal = preorder[preorderIndex] ;
		int rootIndex = map.get(rootVal) ;

		TreeNode root = new TreeNode(rootVal) ;

		preorderIndex++ ;

		root.left = getTreeNode(left_index,rootIndex-1) ;
		root.right = getTreeNode(rootIndex+1,right_index) ;

		return root ;
	}
}
