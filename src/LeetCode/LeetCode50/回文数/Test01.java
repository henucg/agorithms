package LeetCode50.回文数;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1234321)) ;
	}

	public static boolean isPalindrome(int x) {
		if(x<0){
			return false ;
		}
		if(x==0){
			return true ;
		}

		String s = String.valueOf(x) ;
		boolean flag = true ;
		for(int i=0;i<=s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				flag = false ;
				break ;
			}
		}

		return flag ;
	}
}
