package LeetCode.LeetCode50.盛最多水的容器;

public class Test02 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,8,6,2,5,4,8,3,7} ;
		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] height) {
		if(height.length<=1){
			return 0 ;
		}

		int area = 0 ;
		int i = 0 ;
		int j = height.length - 1 ;

		while(i<j){
			int width = j - i ;
			int high = 0 ;
			if(height[i]>height[j]){
				high = height[j] ;
				int a = width * high ;
				if(a>area){
					area = a ;
				}
				j-- ;
			}else{
				high = height[i] ;
				int a = width * high ;
				if(a>area){
					area = a ;
				}
				i++ ;
			}
		}

		return area ;
	}
}
