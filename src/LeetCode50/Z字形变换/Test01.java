package LeetCode50.Z字形变换;

public class Test01 {
	public static void main(String[] args) {
		String s = "ABCDE";
		int numRows = 4 ;
		System.out.println(convert(s,numRows));
	}

	public static String convert(String s, int numRows) {
		if(s==null || "".equals(s) || numRows<=1){
			return s ;
		}

		int length = s.length() ;
		StringBuilder sb = new StringBuilder("") ;
		int n = numRows - 2 ;
		int i = 0 ;
		boolean flag = true ;
		while((i<=length)){
			if(flag) {
				if(i+numRows<=length) {
					sb.append(s.substring(i, i + numRows));
				}else{
					sb.append(s.substring(i, length));
					break ;
				}
				i = i + numRows;
				flag = false;
			}else{
				if(i+n<=length) {
					sb.append(" ").append(convertStr(s.substring(i, i + n))).append(" ");
				}else{
					String s1 = s.substring(i, length) ;
					// 不足补空格
					while(s1.length()<n){
						s1 += " " ;
					}
					sb.append(" ").append(convertStr(s1)).append(" ");
					break ;
				}
				i = i+n ;
				flag = true ;
			}
		}

		StringBuilder result = new StringBuilder("") ;
		if(sb!=null){
			for(int j=0;j<numRows;j++){
				int m = j ;
				while(m<sb.length()){
					result.append(' '==sb.charAt(m)?"":sb.charAt(m)) ;
					m+=numRows ;
				}
			}
		}

		return result.toString() ;
	}

	public static String convertStr(String s){
		if(s==null || "".equals(s)){
			return s ;
		}

		StringBuilder sb = new StringBuilder("") ;
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i)) ;
		}
		return sb.toString() ;
	}
}
