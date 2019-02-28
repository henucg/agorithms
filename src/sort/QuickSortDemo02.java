package sort;

/**
 * 快速排序
 * @author chenge
 *
 */
public class QuickSortDemo02 {

	public static void main(String[] args) {
		int[] arr = {6,1,2,7,9,3,4,5,10,8} ;
		
		arr = sort(arr,0,arr.length-1) ;
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	public static int[] sort(int[] arr,int left,int right) {
		if(left>right) {
			return arr ;
		}
		
		int i = left ;
		int j = right ;
		
		while(i<j) {
			//基数在左边，就从右边开始，可以保证需要跟基数交换的那个数字比基数小
			while(i<j && arr[j]>arr[left]) {
				j-- ;
			}
			
			while(i<j && arr[i]<arr[left]) {
				i++ ;
			}
			
			int temp = arr[i] ;
			arr[i] = arr[j] ;
			arr[j] = temp ;
		}
		
		int temp = arr[i] ;
		arr[i] = arr[left] ;
		arr[left] = temp ;
		
		sort(arr,left,i-1) ;
		sort(arr,i+1,right) ;
		
		return arr ;
	}
}
