package LeetCode50.有效的括号;

import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}

	public static boolean isValid(String s) {
		if(s==null || "".equals(s)){
			return true ;
		}

		Stack<Character> stack = new Stack<>() ;

		for(int i=0;i<s.length();i++){
			if(stack.size()==0){
				stack.push(s.charAt(i));
			}else {
				Character c = stack.peek();
				if (c != null) {
					if((c=='(' && s.charAt(i)==')') || (c=='{' && s.charAt(i)=='}') || (c=='[' && s.charAt(i)==']')){
						stack.pop();
					}else{
						stack.push(s.charAt(i));
					}
				} else {
					stack.push(s.charAt(i));
				}
			}
		}

		if(stack.size()==0){
			return true ;
		}else{
			return false ;
		}
	}
}
