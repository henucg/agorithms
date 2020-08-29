package LeetCode200.寻找旋转排序数组中的最小值;

public class Test01 {

	public static void main(String[] args) {

	}

	public static int findMin(int[] nums) {
		int min = nums[0] ;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<min){
				min = nums[i] ;
				break ;
			}
		}
		return min ;
	}
}
