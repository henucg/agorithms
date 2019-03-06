package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * HashMap按key和value排序
 * @author chenge
 *
 */

public class MapSortDemo01 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>() ;
		map.put("C", 3) ;
		map.put("F", 1) ;
		map.put("D", 45) ;
		map.put("A", 9) ;
		map.put("B", 6) ;
		map.put("E", 12) ;
		map.put("W", 23) ;
		
		//map默认根据Key升序排序
		System.out.println("--------map默认根据Key升序排序--------");
		for (Map.Entry<String, Integer> entry : map.entrySet()) { 
			System.out.println(entry.getKey() + ": " + entry.getValue()); 
		}
		
		//根据Value升序排序
		System.out.println("--------map根据Value升序排序--------");
		sortMapByValue(map) ;
	}
	
	/**
	 * 根据Value升序排序
	 * @param map
	 * @return
	 */
	public static void sortMapByValue(Map<String,Integer> map) {
		if(map==null) {
			return ;
		}
		
		/**
		 * 构建比较器
		 */
		Comparator<Entry<String,Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
			public int compare(Entry<String,Integer> o1,Entry<String,Integer> o2) {
				return o1.getValue() - o2.getValue() ;
			}
		};
		
		//Map转List进行排序
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet()) ;
		
		//排序
		Collections.sort(list,valueComparator);
		
		for(Entry<String,Integer> entry:list) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
