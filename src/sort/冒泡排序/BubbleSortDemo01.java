package sort.冒泡排序;

/**
 * 冒泡排序，时间复杂度为O(n^2)
 * @author ge.chen
 *
 */

public class BubbleSortDemo01 {

	public static void sort(int[] array){
		if(array.length>0){
			int temp = 0 ;
			for(int i=0;i<array.length;i++){
				for(int j=0;j<array.length-1-i;j++){
					if(array[j]>array[j+1]){
						temp = array[j] ;
						array[j] = array[j+1] ;
						array[j+1] = temp ;
					}
				}
			}
		}
	}
	
	public static void main(String[] args){
		int array[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51}; 
		sort(array) ;
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "  ");
		}
	}
}
