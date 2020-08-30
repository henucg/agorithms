package LeetCode.LeetCode150.杨辉三角II;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(getRow(2));
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> lastList = new ArrayList<>() ;
		if(rowIndex<0){
			lastList.add(1) ;
			return lastList ;
		}

		for(int i=0;i<rowIndex+1;i++){
			List<Integer> l = new ArrayList<>() ;
			if(i==0){
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
		}

		return lastList ;
	}
}
