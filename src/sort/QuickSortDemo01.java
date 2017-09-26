package sort;

/**
 * 快速排序
 * @author ge.chen
 *
 */

public class QuickSortDemo01 {

	public static int getMidle(int[] array,int low,int high){
		int flag = array[low] ;
		while(low<high){
			while(low<high&&array[high]>=flag){
				high-- ;
			}
			int tempLow = array[low] ;
			array[low] = array[high] ;
			array[high] = tempLow ;
			
			while(low<high&&array[low]<flag){
				low++ ;
			}
			int tempHigh = array[high] ;
			array[high] = array[low] ;
			array[low] = tempHigh ;
		}
		array[low] = flag ;
		return low ;
	}
	
	public static int[] sort(int[] array,int low,int high){
		int midle = getMidle(array,low,high) ;
		sort(array,low,midle-1) ;
		sort(array,midle+1,high) ;
		return array ;
	}
	
	public static void main(String[] args) {
		int[] array = {46,30,82,90,56,17,95,15} ;
		array = sort(array,0,array.length-1) ;
		
		System.out.println(array.toString());
	}
}
