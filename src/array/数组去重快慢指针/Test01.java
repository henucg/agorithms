package array.数组去重快慢指针;

import java.util.Arrays;

/**
 * 数组去重并返回去重之后数组的长度
 * 只能在愿数组中修改
 */

public class Test01 {

	public static void main(String[] args) {
		System.out.println(dup(new int[]{1,2,2,3,4,4,5,6}));
	}

	public static int dup(int[] arr){
		if(arr.length==0 || arr.length==1){
			return arr.length ;
		}

		// 先排序
		Arrays.sort(arr);

		int i = 0 ;
		for(int j=1;j<arr.length;j++){
			if(arr[i]!=arr[j]){
				i++ ;
				arr[i] = arr[j] ;
			}
		}
		return i + 1 ;
	}
}
