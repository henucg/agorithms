package LeetCode.LeetCode50.整数转罗马数字;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(intToRoman(5));
	}

	public static String intToRoman(int num) {
		return getRoman(new StringBuilder(""),num) ;
	}

	public static String getRoman(StringBuilder sb,int num){
		if(num>=1000){
			int m = num/1000 ;
			int n = num%1000 ;
			for(int i=0;i<m;i++){
				sb.append("M") ;
			}
			return getRoman(sb,n) ;
		}else if(num>=500){
			if(num==900){
				sb.append("CM") ;
				return sb.toString() ;
			}else if(num>900){
				int n = num - 900 ;
				sb.append("CM") ;
				return getRoman(sb,n) ;
			}else {
				int m = num/500 ;
				int n = num%500 ;
				for (int i = 0; i < m; i++) {
					sb.append("D");
				}
				return getRoman(sb,n) ;
			}
		}else if(num>=100){
			if(num==400){
				sb.append("CD") ;
				return sb.toString() ;
			}else if(num>400){
				int n = num - 400 ;
				sb.append("CD") ;
				return getRoman(sb,n) ;
			}else {
				int m = num/100 ;
				int n = num%100 ;
				for (int i = 0; i < m; i++) {
					sb.append("C");
				}
				return getRoman(sb, n);
			}
		}else if(num>=50){
			if(num==90){
				sb.append("XC") ;
				return sb.toString() ;
			} else if(num>90){
				int n = num - 90 ;
				sb.append("XC") ;
				return getRoman(sb,n) ;
			}else {
				int m = num/50 ;
				int n = num%50 ;
				for (int i = 0; i < m; i++) {
					sb.append("L");
				}
				return getRoman(sb, n);
			}
		}else if(num>=10){
			if(num==40){
				sb.append("XL") ;
				return sb.toString() ;
			}else if(num>40){
				int n = num - 40 ;
				sb.append("XL") ;
				return getRoman(sb,n) ;
			}else {
				int m = num/10 ;
				int n = num%10 ;
				for (int i = 0; i < m; i++) {
					sb.append("X");
				}
				return getRoman(sb, n);
			}
		}else if(num>=5){
			if(num==9){
				sb.append("IX") ;
				return sb.toString() ;
			}else {
				int m = num / 5;
				int n = num % 5;
				for (int i = 0; i < m; i++) {
					sb.append("V");
				}
				return getRoman(sb, n);
			}
		}else if(num>=1){
			if(num==4){
				sb.append("IV") ;
				return sb.toString() ;
			}else if(num>4){
				int n = num - 4 ;
				sb.append("IV") ;
				return getRoman(sb,n) ;
			}else {
				int m = num / 1;
				int n = num % 1;
				for (int i = 0; i < m; i++) {
					sb.append("I");
				}
				return sb.toString();
			}
		}else{
			return sb.toString() ;
		}
	}
}
