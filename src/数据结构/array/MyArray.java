package 数据结构.array;

import java.util.Arrays;

public class MyArray {
	private int num = 0 ;	//数组大小
	private int index = 0 ;	//数组下标
	private int[] arr ;

	public MyArray(int num){
		this.num = num ;
		arr = new int[num] ;
	}

	/**
	 * 添加数据
	 * @param value
	 */
	public void add(int value){
		if(index+1>num){
			throw new ArrayIndexOutOfBoundsException() ;
		}

		arr[index] = value ;
		index++ ;
	}

	/**
	 * 删除数据
	 * @param index
	 */
	public void delete(int index){
		if(index>=num || index<0){
			throw new ArrayIndexOutOfBoundsException() ;
		}

		for(int i=index;i<num-1;i++){
			arr[i] = arr[index+1] ;
			index++ ;
		}

		arr[num-1] = 0 ;
		this.index-- ;
	}

	/**
	 * 查找所有数据
	 */
	public void searchAll(){
		Arrays.stream(arr).forEach(x->System.out.print(x+", "));
	}
}
