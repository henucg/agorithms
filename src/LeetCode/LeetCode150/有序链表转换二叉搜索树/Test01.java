package LeetCode.LeetCode150.有序链表转换二叉搜索树;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {

	}

	public static TreeNode sortedListToBST(ListNode head) {
		if(head==null){
			return null ;
		}

		List<Integer> list = new ArrayList<>() ;
		while(head!=null){
			list.add(head.val) ;
			head = head.next ;
		}
		Integer[] arr = new Integer[list.size()] ;
		list.toArray(arr) ;

		return get(arr,0,arr.length-1) ;
	}

	public static TreeNode get(Integer[] arr,int left,int right){
		if(left>right){
			return null ;
		}

		int mid = (left+right)/2 ;
		TreeNode node = new TreeNode(arr[mid]) ;
		node.left = get(arr,left,mid-1) ;
		node.right = get(arr,mid+1,right) ;

		return node ;
	}
}
