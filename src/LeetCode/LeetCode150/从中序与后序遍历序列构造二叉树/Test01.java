package LeetCode.LeetCode150.从中序与后序遍历序列构造二叉树;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	int[] inorder ;
	int[] postorder ;
	int index ;
	Map<Integer,Integer> map = new HashMap<>() ;

	public static void main(String[] args) {
		Test01 t = new Test01() ;
		t.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}) ;
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		this.inorder = inorder ;
		this.postorder = postorder ;
		this.index = postorder.length - 1 ;

		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i],i) ;
		}

		return getTreeNode(0,inorder.length-1) ;
	}

	public TreeNode getTreeNode(int left_index,int right_index){
		if(left_index>right_index){
			return null ;
		}

		int nodeVal = postorder[index] ;
		int nodeIndex = map.get(nodeVal) ;

		index -- ;

		TreeNode node = new TreeNode(nodeVal) ;

		// 后续遍历，先出现右子树
		node.right = getTreeNode(nodeIndex+1,right_index) ;
		node.left = getTreeNode(left_index,nodeIndex-1) ;

		return node ;
	}
}
