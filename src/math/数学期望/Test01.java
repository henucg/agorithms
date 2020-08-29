package 数学期望;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * 求数组的数学期望
 * 若是list集合可以先转为数组
 */

public class Test01 {
	public static void main(String[] args){

		Integer[] array = {1,1,2,3,3} ;

		//数组去重
		Object[] a = arrayDistinct(array) ;
		//求期望
		Double result =  getMathematicalExpectation(array,a) ;
		System.out.println(result);
	}

	/**
	 * 求权重期望
	 * @param array
	 * @param arr
	 * @return
	 */
	public static Double getMathematicalExpectation(Integer[] array,Object[] arr){
		if(array.length>0 && arr.length>0){
			//权重表
			Integer[] wights = new Integer[arr.length] ;

			for(int i=0;i<arr.length;i++){
				//Integer item = (Integer) arr[i] ;
				int count = 0 ;	//	每个数的次数
				for(int j=0;j<array.length;j++){
					if(arr[i].equals(array[j])){
						count ++ ;
					}
				}
				wights[i] = count ;
			}

			BigDecimal result = BigDecimal.ZERO ;
			for(int i=0;i<arr.length;i++){
				BigDecimal wight = new BigDecimal((double) wights[i] / array.length).setScale(2,BigDecimal.ROUND_HALF_UP);
				BigDecimal item = new BigDecimal((Integer) arr[i]) ;
				BigDecimal r = wight.multiply(item).setScale(2,BigDecimal.ROUND_HALF_UP) ;
				result = result.add(r) ;
			}
			return result.doubleValue() ;
		}
		return 0D ;
	}

	/**
	 * 数组去重
	 * @param arr
	 * @return
	 */
	public static Object[] arrayDistinct(Integer [] arr){
		//实例化一个set集合
		Set set = new HashSet();
		//遍历数组并存入集合,如果元素已存在则不会重复存入
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		//返回Set集合的数组形式
		return set.toArray();
	}
}
