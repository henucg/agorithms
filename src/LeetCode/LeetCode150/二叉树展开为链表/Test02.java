package LeetCode.LeetCode150.二叉树展开为链表;

public class Test02 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1) ;
		TreeNode node2 = new TreeNode(2) ;
		TreeNode node3 = new TreeNode(3) ;
		TreeNode node4 = new TreeNode(4) ;
		TreeNode node5 = new TreeNode(5) ;

		node1.left = node2 ;
		node1.right = node5 ;
		node2.left = node3 ;
		node2.right = node4 ;

		flatten(node1);
		System.out.println();
	}

	static TreeNode pre = null ;

	public static void flatten(TreeNode root){
		if(root==null){
			return ;
		}

		flatten(root.left);
		flatten(root.right);
		root.right = pre ;
		root.left = null ;
		pre = root ;
	}
}
