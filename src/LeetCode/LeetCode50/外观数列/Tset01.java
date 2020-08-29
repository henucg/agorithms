package LeetCode50.外观数列;

public class Tset01 {

	public static void main(String[] args) {
		System.out.println(getStr("1211"));
		System.out.println(countAndSay(4));
	}

	public static String countAndSay(int n) {
		int i = 2 ;
		StringBuilder sb = new StringBuilder("1") ;
		while(i<=n){
			sb = getStr(sb.toString()) ;
			i++ ;
		}

		return sb.toString() ;
	}

	public static StringBuilder getStr(String s){
		if(s==null || "".equals(s)){
			return null ;
		}

		int length = s.length() ;

		StringBuilder rs = new StringBuilder("") ;

		if(length==1){
			return rs.append(1).append(s.charAt(0)) ;
		}

		int m = 0 ;

		for(int i=0;i<length;i++){
			if(i==0 || (s.charAt(i)==s.charAt(i-1))){
				m++ ;
			}else{
				rs = rs.append(m).append(s.charAt(i-1)) ;
				m = 1;
			}

			if(i==length-1){
				rs = rs.append(m).append(s.charAt(i)) ;
			}
		}

		return rs ;
	}
}
