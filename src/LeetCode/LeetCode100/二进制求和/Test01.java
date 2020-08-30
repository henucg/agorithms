package LeetCode.LeetCode100.二进制求和;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(addBinary("11010","1100"));
	}

	public static String addBinary(String a, String b) {
		a = new StringBuilder(a).reverse().toString() ;
		b = new StringBuilder(b).reverse().toString() ;

		StringBuilder sb = new StringBuilder("") ;
		char digit = 0 ;
		int i = 0 ;
		int length = Math.max(a.length(),b.length()) ;
		while(i<length){
			char c1 = '0' ;
			char c2 = '0' ;

			if(i<a.length()){
				c1 = a.charAt(i) ;
			}
			if(i<b.length()){
				c2 = b.charAt(i) ;
			}

			if(digit==0){
				if(c1=='0' && c2=='0'){
					sb.append('0') ;
					digit = 0 ;
				}else if((c1=='1' && c2=='0') || (c1=='0' && c2=='1')){
					sb.append('1') ;
					digit = 0;
				}else{
					sb.append('0') ;
					digit = 1 ;
				}
			}else{
				if(c1=='0' && c2=='0'){
					sb.append('1') ;
					digit = 0 ;
				}else if((c1=='1' && c2=='0') || (c1=='0' && c2=='1')){
					sb.append('0') ;
					digit = 1;
				}else{
					sb.append('1') ;
					digit = 1 ;
				}
			}

			i++ ;
		}

		if(digit==1){
			sb.append('1') ;
		}

		return sb.reverse().toString() ;
	}
}
