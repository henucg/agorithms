package LeetCode.LeetCode100.相同的树;

public class Test01 {
	public static void main(String[] args) {

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p!=null && q!=null){
			if(p.val!=q.val){
				return false ;
			}

			boolean left = isSameTree(p.left,q.left) ;
			boolean right = isSameTree(p.right,q.right) ;

			return left & right ;
		}else if(p==null && q==null){
			return true ;
		}else{
			return false ;
		}
	}
}
