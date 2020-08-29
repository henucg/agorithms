package array;

import java.util.Arrays;

/**
 * 对两个已经排序过的数组做归并操作
 * 即安大小合并为一个数组
 */

public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] arr1 = {9, 11, 16, 28, 67, 75};
		int[] arr2 = {8, 26, 30, 48, 56, 66, 93, 97, 99};

		int[] arr3 = new int[arr1.length + arr2.length];

		merge(arr1, arr2, arr3);

		System.out.println(Arrays.toString(arr3));
	}

	/**
	 * 归并数组
	 *
	 * @param arr1
	 * @param arr2
	 */
	public static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}

		if (i < arr1.length) {
			System.arraycopy(arr1, i, arr3, k, arr1.length - i);
		}

		if (j < arr2.length) {
			System.arraycopy(arr2, j, arr3, k, arr2.length - j);
		}
	}
}
