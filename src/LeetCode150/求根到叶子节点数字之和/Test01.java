package LeetCode150.求根到叶子节点数字之和;

public class Test01 {
	static int s = 0 ;

	public static void main(String[] args) {
		System.out.println(sumNumbers(null));
	}

	public static int sumNumbers(TreeNode root) {
		getSum(root,0);
		return s ;
	}

	public static void getSum(TreeNode node,int sum){
		if(node!=null) {
			sum = sum * 10 + node.val;

			if (node.left == null && node.right == null) {
				s += sum;
			} else {
				if (node.left != null) {
					getSum(node.left, sum);
				}

				if (node.right != null) {
					getSum(node.right, sum);
				}
			}
		}
	}
}
