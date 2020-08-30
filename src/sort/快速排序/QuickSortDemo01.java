package sort.快速排序;

/**
 * 快速排序，时间复杂度为 O(NlogN)
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
			array[low] = array[high] ;
			
			while(low<high&&array[low]<flag){
				low++ ;
			}
			array[high] = array[low] ;
		}
		array[low] = flag ;
		return low ;
	}
	
	public static void sort(int[] array,int low,int high){
		if(low>high){
			return ;
		}
		
		int midle = getMidle(array,low,high) ;
		sort(array,low,midle-1) ;
		sort(array,midle+1,high) ;
	}
	
	public static void main(String[] args) {
		int[] array = {46,30,82,90,56,17,95,15} ;
		sort(array,0,array.length-1) ;
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "  ");
		}
	}
}
