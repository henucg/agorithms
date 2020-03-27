package LeetCode.搜索插入位置;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1,3,5,6},0));
	}

	public static int searchInsert(int[] nums, int target) {
		if(nums.length<1){
			return 0 ;
		}

		for(int i=0;i<nums.length;i++){
			if(nums[i]>=target){
				return i ;
			}else if(nums[i]<target && (i+1)<nums.length && nums[i+1]>=target){
				return i+1 ;
			}
		}

		return nums.length ;
	}
}
