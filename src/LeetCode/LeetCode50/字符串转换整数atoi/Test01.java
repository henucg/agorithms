package LeetCode.LeetCode50.字符串转换整数atoi;

public class Test01 {
	public static void main(String[] args) {
		String str = "+-2" ;
		System.out.println(myAtoi(str));
	}

	public static int myAtoi(String str) {
		if(str==null || "".equals(str)){
			return 0 ;
		}
		str = str.trim() ;
		if("".equals(str) || "+".equals(str) || "-".equals(str)){
			return 0 ;
		}
		if(!str.startsWith("-") && !str.startsWith("+") && !Character.isDigit(str.charAt(0))){
			return 0 ;
		}

		String s = "" ;
		for(int i=0;i<str.length();i++){
			if(i==0 && (str.charAt(i)=='-' || str.charAt(i)=='+' || Character.isDigit(str.charAt(i)))){
				s += str.charAt(i) ;
			}else if(Character.isDigit(str.charAt(i))){
				s += str.charAt(i) ;
			}else{
				break ;
			}
		}

		if("".equals(s) || "+".equals(s) || "-".equals(s)){
			return 0 ;
		}

		try {
			return Integer.parseInt(s) ;
		}catch(Exception e){
			if(s.startsWith("-")) {
				return -2147483648;
			}else{
				return 2147483647 ;
			}
		}
	}
}
