package list.List中的元素是否是升序排序;

import java.util.Arrays;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,7,9,2) ;
		System.out.println(isSort(list,0));
	}

	/**
	 * 检查List中的元素是否是升序排序
	 * @param list
	 * @param index
	 * @return
	 */
	public static boolean isSort(List<Integer> list, int index){
		if(list==null || list.size()-1<index){
			return false ;
		}

		if(index+1<=list.size()-1){
			if(list.get(index)>list.get(index+1)){
				return false ;
			}else{
				return isSort(list,index+1) ;
			}
		}

		return true ;
	}
}
