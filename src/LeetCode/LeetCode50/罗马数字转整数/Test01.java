package LeetCode.LeetCode50.罗马数字转整数;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		if(s==null || "".equals(s)){
			return 0 ;
		}

		int a = 0 ;
		if(s.contains("IV")){
			s = s.replace("IV","") ;
			a += 4 ;
		}
		if(s.contains("IX")){
			s = s.replace("IX","") ;
			a += 9 ;
		}
		if(s.contains("XL")){
			s = s.replace("XL","") ;
			a += 40 ;
		}
		if(s.contains("XC")){
			s = s.replace("XC","") ;
			a += 90 ;
		}
		if(s.contains("CD")){
			s = s.replace("CD","") ;
			a += 400 ;
		}
		if(s.contains("CM")){
			s = s.replace("CM","") ;
			a += 900 ;
		}

		if(!"".equals(s)){
			for(int i=0;i<s.length();i++){
				if('I'==s.charAt(i)){
					a += 1 ;
				}else if('V'==s.charAt(i)){
					a += 5 ;
				}else if('X'==s.charAt(i)){
					a += 10 ;
				}else if('L'==s.charAt(i)){
					a += 50;
				}else if('C'==s.charAt(i)){
					a += 100 ;
				}else if('D'==s.charAt(i)){
					a += 500 ;
				}else if('M'==s.charAt(i)){
					a += 1000 ;
				}
			}
		}

		return a ;
	}
}
