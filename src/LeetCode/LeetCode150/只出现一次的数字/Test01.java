package LeetCode150.只出现一次的数字;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{4,1,2,1,2}));
	}

	public static int singleNumber(int[] nums) {
		if(nums==null || nums.length==1){
			return nums[0] ;
		}

		Arrays.sort(nums);

		for(int i=0;i<nums.length;i++){
			if(i==0){
				if(nums[i]<nums[i+1]) {
					return nums[i];
				}
			}else if(i==nums.length-1){
				if(nums[i]>nums[i-1]) {
					return nums[i];
				}
			}else {
				if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
					return nums[i];
				}
			}
		}

		return 0 ;
	}
}
