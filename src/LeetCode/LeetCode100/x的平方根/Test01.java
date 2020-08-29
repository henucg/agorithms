package LeetCode100.x的平方根;

/**
 * 数字比较大的时候性能比较差
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(mySqrt(100));
	}

	public static int mySqrt(int x) {
		if(x==0){
			return 0 ;
		}

		int i = 1 ;
		while(i<=x){
			if(i*i==x){
				break ;
			}else if(i*i<x && (i+1)*(i+1)>x){
				break ;
			}

			i++ ;
		}

		return i ;
	}
}
