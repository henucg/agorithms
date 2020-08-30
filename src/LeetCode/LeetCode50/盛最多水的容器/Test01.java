package LeetCode.LeetCode50.盛最多水的容器;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = new int[]{1,8,6,2,5,4,8,3,7} ;
		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] height) {
		if(height.length<=1){
			return 0 ;
		}

		int area = 0 ;
		for(int i=0;i<height.length;i++){
			for(int j=i;j<height.length;j++){
				if(j>i){
					int width = j-i ;
					int high = height[i] > height[j] ? height[j] : height[i] ;
					int a = width * high ;
					if(a>area){
						area = a ;
					}
				}
			}
		}

		return area ;
	}
}
