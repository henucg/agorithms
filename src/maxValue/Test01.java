package maxValue;

/**
 * 给定一个数组arr找出该数组中，两个元素相减的最大值，其中被减数的下标不小于减数的下标。
即求出： maxValue = max{arr[j]-arr[i] and j >= i}
 * @author chenge
 *
 */

public class Test01 {

	public static int[] arr = {0,9,16,43,34,5,77,2,0,102,45,999} ;
	
	public static void main(String[] args) {
		int max = 0 ;
		int m = 0 ;
		int n = 0 ;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[j] - arr[i] ;
				if(temp>=max) {
					max = temp ;
					m = i ;
					n = j ;
				}
			}
		}
		
		System.out.println("max = " + max + ", m = " + m + ", n = " + n);
	}
}
