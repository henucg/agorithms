package LeetCode.LeetCode50.删除排序数组中的重复项;

public class Test01 {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4} ;
		System.out.println(removeDuplicates(nums)) ;
	}

	public static int removeDuplicates(int[] nums) {
		if(nums.length==0){
			return 0 ;
		}

		int index = 0 ;
		int last = 0 ;
		for(int i=0;i<nums.length;i++){
			if(i!=0 && last!=nums[i]){
				index++ ;
				nums[index] = nums[i] ;
			}
			last = nums[i] ;
		}
		return ++index ;
	}
}
