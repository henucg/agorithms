package LeetCode.LeetCode150.验证回文串;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("."));
	}

	public static boolean isPalindrome(String s) {
		if(s==null || "".equals(s)){
			return false ;
		}

		s = s.toLowerCase() ;

		int i = 0 ;
		int j = s.length() - 1 ;
		while(i<=j){
			while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
				i++ ;
			}
			while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
				j-- ;
			}

			if(s.charAt(i)!=s.charAt(j)){
				return false ;
			}

			i++ ;
			j-- ;
		}

		return true ;
	}
}
