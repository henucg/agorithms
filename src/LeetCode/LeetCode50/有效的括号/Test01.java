package LeetCode50.有效的括号;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}

	public static boolean isValid(String s) {
		if(s==null||"".equals(s)){
			return false ;
		}

		return isVa(s) ;
	}

	public static boolean isVa(String s){
		String s1 = s.replace("()","").replace("[]","").replace("{}","") ;
		if(s1==s){
			return false ;
		}
		if(!"".equals(s1)){
			return isVa(s1) ;
		}else{
			return true ;
		}
	}
}
