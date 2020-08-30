package LeetCode.LeetCode100.爬楼梯;

/**
 * 数字比较大的时候会出现栈溢出
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}

	public static int climbStairs(int n) {
		StringBuilder sb = new StringBuilder("") ;
		get(sb,n) ;
		return sb.length() ;
	}

	public static void get(StringBuilder sb,int n){
		if(n==0){
			sb.append("a") ;
		}

		if(n>=2){
			n = n-2 ;
			get(sb,n) ;
			n = n + 2 ;
		}

		if(n>=1){
			n = n - 1 ;
			get(sb,n) ;
			n = n + 1 ;
		}
	}
}
