package LeetCode.LeetCode50.四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4} ;
		int target = -1 ;
		fourSum(nums,target) ;
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>() ;
		if(nums==null || nums.length<4){
			return list ;
		}

		Arrays.sort(nums);

		for(int i=0;i<=nums.length-4;i++){
			if(i>0 && nums[i-1]==nums[i])continue;

			for(int j=i+1;j<=nums.length-3;j++){
				if(j>i+1 && nums[j-1]==nums[j])continue;

				int m = j+1 ;
				int n = nums.length - 1 ;
				while(m<n){
					int sum = nums[i]+nums[j]+nums[m]+nums[n] ;
					if(sum==target){
						list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[m],nums[n]))) ;

						while(m<n && nums[m++]==nums[m]);
						while(m<n && nums[n--]==nums[n]);
					}else if(sum<target){
						while(m<n && nums[m++]==nums[m]);
					}else {
						while(m<n && nums[n--]==nums[n]);
					}
				}
			}
		}
		return list ;
	}
}
