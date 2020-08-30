package LeetCode.LeetCode50.两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test0001_02 {
	public static void main(String[] args) {
		int[] nums = {3,2,4} ;
		int target = 6 ;

		System.out.println(Arrays.toString(twoSum(nums,target))) ;
	}

	public static int[] twoSum(int[] nums,int target){
		Map<Integer,Integer> map = new HashMap<>() ;
		for(int i=0;i<nums.length;i++){
			int temp = target - nums[i] ;
			if(!map.containsKey(nums[i])){
				map.put(temp,i) ;
			}else{
				return new int[]{map.get(nums[i]),i} ;
			}
		}
		return new int[]{};
	}
}
