package LeetCode.罗马数字转整数;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}

	public static int romanToInt(String s) {
		if(s==null || "".equals(s)){
			return 0 ;
		}

		int a = 0 ;

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='I'){
				if((i+1)<s.length() && s.charAt(i+1)=='V'){
					a += 4 ;
					i++;
				}else if((i+1)<s.length() && s.charAt(i+1)=='X'){
					a += 9 ;
					i++;
				}else{
					a += 1 ;
				}
			}else if(s.charAt(i)=='X'){
				if((i+1)<s.length() && s.charAt(i+1)=='L'){
					a += 40 ;
					i++;
				}else if((i+1)<s.length() && s.charAt(i+1)=='C'){
					a += 90 ;
					i++;
				}else{
					a += 10 ;
				}
			}else if(s.charAt(i)=='C'){
				if((i+1)<s.length() && s.charAt(i+1)=='D'){
					a += 400 ;
					i++;
				}else if((i+1)<s.length() && s.charAt(i+1)=='M'){
					a += 900 ;
					i++;
				}else{
					a += 100 ;
				}
			}else if('V'==s.charAt(i)){
				a += 5 ;
			}else if('L'==s.charAt(i)){
				a += 50;
			}else if('D'==s.charAt(i)){
				a += 500 ;
			}else if('M'==s.charAt(i)){
				a += 1000 ;
			}
		}

		return a ;
	}
}
