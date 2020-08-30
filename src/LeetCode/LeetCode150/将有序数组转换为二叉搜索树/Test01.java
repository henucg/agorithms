package LeetCode.LeetCode150.将有序数组转换为二叉搜索树;

public class Test01 {
	public static void main(String[] args) {
		Test01 t = new Test01() ;
		TreeNode node = t.sortedArrayToBST(new int[]{1,2,3,4,5,6}) ;
		System.out.println(node);
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null){
			return null ;
		}
		return getNode(nums,0,nums.length-1) ;
	}

	public TreeNode getNode(int[] nums,int left,int right){
		if(left>right){
			return null ;
		}

		int mid = (left + right)/2 ;

		TreeNode node = new TreeNode(nums[mid]) ;
		node.left = getNode(nums,left,mid-1) ;
		node.right = getNode(nums,mid+1,right) ;

		return node ;
	}
}
