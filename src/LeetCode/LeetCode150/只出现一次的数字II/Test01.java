package LeetCode150.只出现一次的数字II;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {

	}

	public static int singleNumber(int[] nums){
		Set<Long> set = new HashSet<Long>() ;

		int sumArr = 0 ;
		for(long i:nums){
			sumArr += i ;
			set.add(i) ;
		}

		int sumSet = 0 ;
		for(long i:set){
			sumSet += i ;
		}

		return (3*sumSet - sumArr)/2 ;
	}
}
