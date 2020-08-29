package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 证明List是否是按顺序排好的
 */
public class List01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("b","B","A","a","d","c","E") ;
		System.out.println(isSort(list,0));

		List<String> list2 = Arrays.asList("A","B","C","D","E","F","G") ;
		System.out.println(isSort(list2,0));
	}

	/**
	 * 判断List中的元素是否是按顺序排好的
	 * @param list
	 * @return
	 */
	public static boolean isSort(List<String> list,int index){
		if(list==null && list.size()-1<index){
			return false ;
		}

		if(index+1<=list.size()-1){
			if(list.get(index).compareTo(list.get(index+1))>0){
				return false ;
			}else{
				return isSort(list,index+1) ;
			}
		}

		return true ;
	}
}
