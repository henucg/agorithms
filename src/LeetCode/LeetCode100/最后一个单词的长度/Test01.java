package LeetCode.LeetCode100.最后一个单词的长度;

public class Test01 {

	public static void main(String[] args) {
		String s = "Hello World   " ;
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		if(s==null || "".equals(s)){
			return 0 ;
		}

		int n = 0 ;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				n++ ;
			}else if(n>0){
				break ;
			}
		}

		return n ;
	}
}
