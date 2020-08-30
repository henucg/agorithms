package sort.选择排序;

import java.util.Arrays;

/**
 * 选择排序，排序的数据比较少的时候使用
 */

public class InsertSortDemo01 {
	public static void main(String[] args) {
		int[] arr1 = {99, 11, 66, 28, 67, 7};

		sort(arr1);

		System.out.println(Arrays.toString(arr1));
	}

	public static void sort(int[] arr) {
		if(arr!=null && arr.length>0) {
			for (int i=0;i<arr.length;i++){
				int j = i  ;
				int temp = arr[i] ;
				while(j>0 && arr[j-1]>temp){
					arr[j] = arr[--j] ;
					//j-- ;
				}
				arr[j] = temp ;
			}
		}
	}
}
