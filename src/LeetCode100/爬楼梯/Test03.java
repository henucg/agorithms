package LeetCode100.爬楼梯;

public class Test03 {
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}

	public static int climbStairs(int n) {
		return get(0,n);
	}

	public static int get(int i,int n){
		if(i>n){
			return 0 ;
		}

		if(i==n){
			return 1 ;
		}

		return get(i+2,n) + get(i+1,n) ;
	}
}
