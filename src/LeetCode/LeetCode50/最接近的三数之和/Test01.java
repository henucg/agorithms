package LeetCode.LeetCode50.最接近的三数之和;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] nums = new int[]{0,2,1,-3};
		int target = 1 ;
		System.out.println(threeSumClosest(nums,target)) ;
	}

	public static int threeSumClosest(int[] nums, int target) {
		if(nums==null || nums.length<3){
			return 0 ;
		}

		Arrays.sort(nums);
		Integer ans = nums[0] + nums[1] + nums[2] ;
		for(int i=0;i<nums.length-2;i++){
			int m = i+1 ;
			int n = nums.length - 1 ;
			while(m<n) {
				int sum = nums[i] + nums[m] + nums[n];
				if(Math.abs(target-sum)<Math.abs(target-ans)){
					ans = sum ;
				}

				if(sum>target){
					n-- ;
				}else if(sum<target){
					m++ ;
				}else{
					return ans ;
				}
			}
		}

		return ans ;
	}
}
