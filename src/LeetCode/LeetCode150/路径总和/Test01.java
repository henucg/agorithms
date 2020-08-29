package LeetCode150.路径总和;

public class Test01 {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1) ;
		TreeNode node2 = new TreeNode(2) ;

		node1.left = node2 ;
		System.out.println(hasPathSum(node1,1));
	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root==null){
			return false ;
		}

		return getDep(root,sum,0) ;
	}

	public static boolean getDep(TreeNode node,int sum,int nodeSum){
		if(node==null){
			return false ;
		}else{
			nodeSum += node.val ;
			if(node.left==null && node.right==null){
				if(nodeSum==sum){
					return true ;
				}
			}else{
				boolean left = getDep(node.left,sum,nodeSum) ;
				boolean right = getDep(node.right,sum,nodeSum) ;

				return left || right ;
			}
		}
		return false ;
	}
}
