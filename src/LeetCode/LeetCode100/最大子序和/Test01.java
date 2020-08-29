package LeetCode100.最大子序和;

/**
 * 动态规划
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4} ;
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {
		if(nums==null || nums.length==0){
			return 0 ;
		}
		if(nums.length==1){
			return nums[0] ;
		}

		int max = nums[0] ;
		for(int i=1;i<nums.length;i++){
			if(nums[i-1]>0){
				nums[i] += nums[i-1] ;
			}

			if(nums[i]>max){
				max = nums[i] ;
			}
		}

		return max ;
	}
}
