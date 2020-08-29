package LeetCode150.对称二叉树;

public class Test01 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1) ;
		root.left = new TreeNode(2) ;
		root.right = new TreeNode(2) ;

		root.left.left = new TreeNode(2) ;
		root.right.left = new TreeNode(2) ;

		System.out.println(isSymmetric(root));
	}

	public static boolean isSymmetric(TreeNode root) {
		return getMidSearchStr(root,root) ;
	}

	public static boolean getMidSearchStr(TreeNode node1,TreeNode node2){
		if(node1==null && node2==null){
			return true ;
		}

		if((node1==null && node2!=null) || (node1!=null && node2==null)){
			return false ;
		}

		return (node1.val==node2.val) && getMidSearchStr(node1.left,node2.right) && getMidSearchStr(node1.right,node2.left) ;
	}
}
