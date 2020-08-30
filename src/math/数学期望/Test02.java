package math.数学期望;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 求数学期望
 */

public class Test02 {

	public static void main(String[] args) {
		Integer[] array = {1,1,2,3,3} ;
		Double result = getMathematicalExpectation(array) ;
		System.out.println(result);
	}

	/**
	 * 求数学期望
	 * @param array
	 * @return
	 */
	public static Double getMathematicalExpectation(Integer[] array){
		if (array.length>0){
			Map<Integer,Integer> map = new HashMap<Integer,Integer>() ;

			for(int i=0;i<array.length;i++){
				if(map.containsKey(array[i])){
					map.put(array[i],map.get(array[i]) + 1) ;
				}else{
					map.put(array[i],1) ;
				}
			}

			//遍历map，求期望
			BigDecimal result = BigDecimal.ZERO ;
			for (Integer key : map.keySet()) {
				BigDecimal wight = (new BigDecimal(map.get(key))).divide(new BigDecimal(array.length)).setScale(2,BigDecimal.ROUND_HALF_UP) ;
				BigDecimal mapWight = new BigDecimal(key).multiply(wight) ;

				result = result.add(mapWight) ;
			}

			return result.doubleValue() ;
		}

		return 0D ;
	}
}
