package LeetCode100.x的平方根;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(mySqrt(2147395599));
	}

	public static int mySqrt(int x) {
		if(x<2){
			return x ;
		}

		long num = 0 ;

		int left = 2 ;
		int right = x/2 ;
		while(left<=right){
			int prot = left + (right - left)/2 ;
			num = (long)prot * prot ;
			if(num>x){
				right = prot - 1 ;
			}else if(num<x){
				left = prot + 1 ;
			}else{
				return prot ;
			}
		}
		return right ;
	}
}
