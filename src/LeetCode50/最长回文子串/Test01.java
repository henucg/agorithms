package LeetCode50.最长回文子串;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaabaaaa"));
	}

	public static String longestPalindrome(String s) {
		if(s==null){
			return null ;
		}
		if("".equals(s)){
			return "" ;
		}

		if(isEquals(s.charAt(0),s)){
			return s ;
		}

		int length = s.length() ;

		String subS = "" ;
		for(int i=0;i<length;i++){
			int j = i ;
			int n = 0 ;
			int m = 0 ;
			String sub = "" ;
			while(j>=0 && j<length){
				if(n==0){
					sub += s.charAt(j) ;
					n++ ;
				}else if((j-n>=0 && j+n+m<length) && s.charAt(j-n)==s.charAt(j+n+m)){
					sub = s.charAt(j-n) + sub + s.charAt(j+n+m) ;
					n++ ;
				}else if((j+n+m<length) && isEquals(s.charAt(j+n+m),sub)){
					sub = sub + s.charAt(j+n+m) ;
					m++ ;
				}else{
					break ;
				}
			}
			if(sub.length()>subS.length()){
				subS = sub ;
			}
		}

		return subS ;
	}

	public static boolean isEquals(char c,String s){
		if(s==null){
			return false ;
		}

		for(int i=0;i<s.length();i++){
			if(c!=s.charAt(i)){
				return false ;
			}
		}
		return true ;
	}
}
