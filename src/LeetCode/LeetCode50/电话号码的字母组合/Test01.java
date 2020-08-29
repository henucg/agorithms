package LeetCode50.电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		letterCombinations("234") ;
	}

	public static List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<>() ;

		if(digits==null || "".equals(digits)){
			return list ;
		}

		Map<String,String> map = new HashMap<>() ;
		map.put("2","abc") ;
		map.put("3","def") ;
		map.put("4","ghi") ;
		map.put("5","jkl") ;
		map.put("6","mno") ;
		map.put("7","pqrs") ;
		map.put("8","tuv") ;
		map.put("9","wxyz") ;

		getStr(list,map,"",digits);

		return list ;
	}

	public static void getStr(List<String> list,Map<String,String> map,String head,String chrild){
		String key = map.get(chrild.substring(0,1)) ;
		for(int i=0;i<key.length();i++){
			if(chrild.length()>1) {
				//head += key.charAt(i)+"" ;
				getStr(list,map,(head + key.charAt(i)),chrild.substring(1));
			}else{
				//System.out.println(head+key.charAt(i)+"") ;
				list.add(head+key.charAt(i)) ;
			}
		}
	}
}
