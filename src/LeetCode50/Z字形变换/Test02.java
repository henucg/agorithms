package LeetCode50.Z字形变换;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		String s = "AB";
		int numRows = 1 ;
		System.out.println(convert(s,numRows));
	}

	public static String convert(String s, int numRows) {
		if(s==null || "".equals(s) || s.length()<numRows || numRows==1){
			return s ;
		}

		int bath = s.length()<numRows?s.length():numRows ;
		List<StringBuilder> list = new ArrayList<>() ;
		for(int i=0;i<bath;i++){
			list.add(new StringBuilder()) ;
		}

		int index = 0 ;
		boolean flag = false ;
		for(char c:s.toCharArray()){
			list.get(index).append(c) ;
			if(index==0 || index==numRows-1){
				flag = !flag ;
			}

			index+= flag?1:-1 ;
		}

		StringBuilder sb = new StringBuilder() ;
		for(StringBuilder ss:list){
			sb.append(ss) ;
		}

		return sb.toString() ;
	}
}
