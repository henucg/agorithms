package 螺旋数组;

public class Test01 {

	public static void main(String[] args) {
		int n = 10 ;
		
		int[][] array = getArray(n) ;
		
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print(array[i][j] + "	");
			}
			System.out.println("");
		}
	}
	
	/**
	 *  返回一个二位数组
	 * @param n：数组维度
	 * @return
	 */
	public static int[][] getArray(int n){
		int[][] array = new int[n][n] ;	
		int num = 1 ;		//计数器，每次+1
		
		int k = n/2 + 1 ;		//需要循环的次数
		
		int i = 0 ;
		int j = 0 ;
		 
		 //每循环一次，确定最外层数据
		for(int m=0;m<k;m++) {
			for(i=m,j=m;i<(n-m);i++) {
				array[i][j] = num++ ;
			}
			i-- ;
			
			for(j=j+1;j<(n-m);j++) {
				array[i][j] = num++ ;
			}
			j-- ;
			
			for(i=i-1;i>=m;i--) {
				array[i][j] = num++ ;
			}
			i++ ;
			
			for(j=j-1;j>m;j--) {
				array[i][j] = num++ ;
			}
			j++ ;
		}
		
		return array ;
	}
}
