package LeetCode.LeetCode50.整数转罗马数字;

/**
 * 贪心算法
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(intToRoman(1994));
	}

	public static String intToRoman(int num) {
		String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"} ;
		int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1} ;

		StringBuilder sb = new StringBuilder("") ;

		int i = 0 ;
		while(num>0){
			int n = 0 ;
			for(;i<ints.length;i++){
				if(num>=ints[i]){
					n = i ;
					break ;
				}
			}

			num = num - ints[n] ;
			sb.append(strs[n]) ;
		}

		return sb.toString() ;
	}
}
