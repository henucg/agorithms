package LeetCode50.回文数;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-1234321));
	}

	public static boolean isPalindrome(int x) {
		if(x<0){
			return false ;
		}
		if(x==0){
			return true ;
		}

		int x1 = x ;
		int a = 0 ;
		while(x1!=0){
			a = a*10 + x1%10 ;
			x1 = x1/10 ;
		}

		return x==a?true:false;
	}
}
