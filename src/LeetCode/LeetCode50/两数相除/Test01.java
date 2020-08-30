package LeetCode.LeetCode50.两数相除;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(divide(-2147483648 ,1));
	}

	public static int divide(int dividend, int divisor) {
		if(dividend==Integer.MAX_VALUE && divisor==1) {
			return Integer.MAX_VALUE;
		}else if(dividend==Integer.MIN_VALUE && divisor==1){
			return Integer.MIN_VALUE;
		}else if(dividend==Integer.MAX_VALUE && divisor==-1){
			return Integer.MIN_VALUE + 1 ;
		}else if(dividend==Integer.MIN_VALUE && divisor==-1){
			return Integer.MAX_VALUE ;
		}

		int i = -1 ;
		if((dividend>0 && divisor<0) || (dividend<0 && divisor>0)){
			i = 1 ;
		}

		dividend = dividend <= 0 ? dividend : -dividend ;
		divisor = divisor <= 0 ?divisor : -divisor ;

		if(dividend>divisor){
			return 0 ;
		}

		int n = 0 ;
		while(dividend<=divisor){
			dividend = dividend - divisor ;
			n-- ;
		}

		return i * n ;
	}
}
