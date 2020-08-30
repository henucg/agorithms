package LeetCode.LeetCode50.两数之和;

import java.util.Arrays;

public class Test0001 {
	public static void main(String[] args) {
		int[] nums = {3,2,4} ;
		int target = 6 ;

		System.out.println(Arrays.toString(twoSum(nums,target))) ;
	}

	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					return new int[]{i,j};
				}
			}
		}

		return new int[]{};
	}
}
