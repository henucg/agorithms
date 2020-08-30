package LeetCode.LeetCode150.杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(generate(3));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>() ;
		if(numRows<1){
			return list ;
		}

		List<Integer> lastList = null ;
		for(int i=0;i<numRows;i++){
			List<Integer> l = new ArrayList<>() ;
			if(i==0 && lastList==null){
				l.add(1) ;
			}else if(i==1){
				l.add(1) ;
				l.add(1) ;
			}else{
				l.add(1) ;
				for(int j=0;j<lastList.size()-1;j++){
					l.add(lastList.get(j)+lastList.get(j+1)) ;
				}
				l.add(1) ;
			}

			lastList = l ;
			list.add(l) ;
		}

		return list ;
	}
}
