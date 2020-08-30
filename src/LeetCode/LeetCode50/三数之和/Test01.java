package LeetCode.LeetCode50.三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = new int[]{-1, 0, 1, 2, -1, -4} ;
		threeSum(arr) ;
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3){
			return new ArrayList<>() ;
		}

		List<List<Integer>> result = new ArrayList<>() ;

		Arrays.sort(nums);

		for(int i=0;i<nums.length-2;i++){
			// 后面的和不可能小于0
			if(nums[i]>0){
				break ;
			}
			// 防止重复
			if(i>0 && nums[i]==nums[i-1]){
				continue;
			}

			int m = i+1 ;
			int n = nums.length - 1 ;
			while(m<n){
				int sum = nums[i] + nums[m] + nums[n] ;
				if(sum>0){
					n--;
				}else if(sum<0){
					m++ ;
				}else{
					List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[m],nums[n])) ;
					result.add(list);

					//防止重复
					while(m<n && nums[m]==nums[++m]);
					while(m<n && nums[n]==nums[--n]);
				}
			}
		}

		return result ;
	}
}
