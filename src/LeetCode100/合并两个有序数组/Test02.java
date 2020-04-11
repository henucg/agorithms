package LeetCode100.合并两个有序数组;

public class Test02 {
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int m = 3 ;
		int[] nums2 = {1,2,3};
		int n = 3 ;

		merge(nums1,m,nums2,n);
		System.out.println(nums1.toString());

//		int[] s = new int[]{2,5,6} ;
//		int[] p = new int[]{1,2,3,3,5,6} ;
//		System.arraycopy(s,0,p,0,1);
//		System.out.println("");
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1 ;
		int p2 = n - 1 ;

		int p = m + n - 1 ;

		while((p1>=0) && (p2>=0)){
			nums1[p--] = (nums1[p1]<nums2[p2]) ? nums2[p2--] : nums1[p1--] ;
		}

		System.arraycopy(nums2,0,nums1,0,p2+1);
	}
}
