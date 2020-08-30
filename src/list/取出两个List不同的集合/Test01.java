package list.取出两个List不同的集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//list1、list2都不存在自己相同的对象
		List<BeanDemo> list1 = new ArrayList<>() ;
		List<BeanDemo> list2 = new ArrayList<>() ;

		Map<BeanDemo,Integer> map = new HashMap<>() ;

		// 遍历List1
		for(int i=0;i<list1.size();i++){
			map.put(list1.get(i), 1);
		}

		// 遍历List2
		for(int i=0;i<list2.size();i++){
			if(map.get(list2.get(i))==null){
				map.put(list2.get(i),1) ;
			}else{
				// 重复项
				map.put(list2.get(i),2) ;
			}
		}

		// 差异集合
		List<BeanDemo> list = new ArrayList<>() ;
		// 遍历Map取出所有差异项
		for(Map.Entry<BeanDemo,Integer> entry:map.entrySet()){
			if(entry.getValue()==1){
				list.add(entry.getKey()) ;
			}
		}
	}
}
