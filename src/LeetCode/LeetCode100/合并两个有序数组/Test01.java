package LeetCode100.合并两个有序数组;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int m = 3 ;
		int[] nums2 = {1,2,3};
		int n = 3 ;

		merge(nums1,m,nums2,n);
		System.out.println(nums1.toString());
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2,0,nums1,m,n);
		Arrays.sort(nums1);
	}
}
