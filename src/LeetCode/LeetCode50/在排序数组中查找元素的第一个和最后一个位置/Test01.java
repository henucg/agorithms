package LeetCode50.在排序数组中查找元素的第一个和最后一个位置;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = new int[]{5,7,7,8,8,10} ;
		searchRange(arr,6) ;
	}

	public static int[] searchRange(int[] nums, int target) {
		if(nums==null || nums.length<1 || nums[0]>target || nums[nums.length-1]<target){
			return new int[]{-1,-1} ;
		}

		int i = 0 ;
		int j = nums.length - 1 ;
		while(i<=j){
			if((nums[i]==target && nums[j]==target) || i==j){
				break ;
			}

			if(nums[i]<target){
				i++ ;
			}
			if(nums[j]>target){
				j-- ;
			}
		}

		if(target!=nums[i]){
			return new int[]{-1,-1} ;
		}else{
			return new int[]{i,j} ;
		}
	}
}
