package LeetCode50.无重复字符的最长子串;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s==null || "".equals(s)){
			return 0 ;
		}

		int k = 1 ;
		for(int i=0;i<s.length();i++){
			int k1 = 1 ;
			String s1 = s.charAt(i) + "" ;

			for(int j=i+1;j<s.length();j++){
				if(!s1.contains(s.charAt(j)+"")){
					k1++ ;
					s1 += s.charAt(j) ;
				}else{
					break ;
				}
			}

			if(k1>k){
				k = k1 ;
			}
		}

		return k ;
	}
}
