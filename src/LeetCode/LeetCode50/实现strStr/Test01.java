package LeetCode.LeetCode50.实现strStr;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","pi"));
	}

	public static int strStr(String haystack, String needle) {
		if("".equals(needle)){
			return 0 ;
		}

		if("".equals(haystack) && "".equals(needle)){
			return 0 ;
		}

		if(needle.length()>haystack.length()){
			return -1 ;
		}

		if(haystack==null || needle==null){
			return -1 ;
		}

		if(haystack.equals(needle)){
			return 0 ;
		}

		int nlength = needle.length() ;

		for(int i=0;i<haystack.length()-nlength+1;i++){
			if(haystack.substring(i,i+nlength).equals(needle)){
				return i ;
			}
		}

		return -1 ;
	}
}
