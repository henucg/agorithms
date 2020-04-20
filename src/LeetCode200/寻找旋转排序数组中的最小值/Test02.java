package LeetCode200.寻找旋转排序数组中的最小值;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(findMin(new int[]{0,1}));
	}

	public static int findMin(int[] nums) {
		if(nums.length==1){
			return nums[0] ;
		}

		int i = 0 ;
		int j = nums.length - 1 ;

		if(nums[j]>nums[0]){
			return nums[0] ;
		}

		while(i<=j){
			int mid = (i+j)/2 ;

			if(nums[mid]>nums[mid+1]){
				return nums[mid+1] ;
			}

			if(nums[mid-1]>nums[mid]){
				return nums[mid] ;
			}

			if(nums[mid]>nums[0]){
				i = mid + 1 ;
			}else{
				j = mid - 1 ;
			}
		}
		return -1 ;
	}
}
