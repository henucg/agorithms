package LeetCode100.加一;

public class Test01 {

	public static void main(String[] args) {
		int[] digits = {9,9,9} ;
		plusOne(digits) ;
	}

	public static int[] plusOne(int[] digits) {
		if(digits==null || digits.length==0){
			return new int[]{} ;
		}

		int digit = 0 ;
		for(int i=digits.length-1;i>=0;i--){
			if(digits[i]+1>9){
				digit = 1 ;
				digits[i] = 0 ;
			}else{
				digits[i] = digits[i] + 1 ;
				digit = 0 ;
				break ;
			}
		}

		if(digit==1){
			int[] arr = new int[digits.length+1];
			arr[0] = 1 ;
			for(int i=1;i<arr.length;i++){
				arr[i] = digits[i-1] ;
			}
			return arr ;
		}

		return digits ;
	}
}
