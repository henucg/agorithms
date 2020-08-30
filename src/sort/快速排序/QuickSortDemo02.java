package sort.快速排序;

import java.util.Arrays;

public class QuickSortDemo02 {
	public static void main(String[] args) {

		int[] arr = {23,34,56,22,6,5,78,98,123,55,786,231,23} ;
		sort(arr,0,arr.length-1) ;
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr,int low,int high){
		if(low>high) {
			return;
		}

		int flag = arr[low] ;
		int i = low ;
		int j = high ;

		while(i<j){
			while(i<j && arr[j]>=flag){
				j-- ;
			}

			while(i<j && arr[i]<=flag){
				i++ ;
			}

			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		arr[low] = arr[i] ;
		arr[i] = flag ;

		sort(arr,low,i-1);
		sort(arr,i+1,high) ;
	}
}
