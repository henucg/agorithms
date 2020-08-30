package string.最长公共子字符串;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(getLongStr("abcde","ace")) ;
	}

	public static int getLongStr(String str1,String str2){
		return get(str1,str1.length()-1,str2,str2.length()-1) ;
	}

	public static int get(String str1,int i,String str2,int j){
		if(i<0 || j<0){
			return 0 ;
		}else if(str1.charAt(i)==str2.charAt(j)){
			return get(str1,i-1,str2,j-1) + 1 ;
		}else{
			int i1 = get(str1,i-1,str2,j) ;
			int j1 = get(str1,i,str2,j-1) ;
			return Math.max(i1,j1) ;
		}
	}
}
