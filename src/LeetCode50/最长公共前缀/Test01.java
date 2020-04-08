package LeetCode50.最长公共前缀;

public class Test01 {
	public static void main(String[] args) {
		String[] strs = {"dog","racecar","car"} ;
		System.out.println(longestCommonPrefix(strs)) ;
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length<1){
			return "" ;
		}else if(strs.length==1){
			return strs[0] ;
		}

		return prefix(new StringBuilder(""),0,strs).toString() ;
	}

	public static StringBuilder prefix(StringBuilder sb,int index,String[] strs){
		Character s = null ;
		for(int i=0;i<strs.length;i++){
			if(index >= strs[i].length()){
				return sb ;
			}

			if(s==null){
				s = strs[i].charAt(index) ;
			}else if(s!=strs[i].charAt(index)){
				return sb ;
			}
		}

		sb.append(s) ;

		return prefix(sb,++index,strs) ;
	}
}
