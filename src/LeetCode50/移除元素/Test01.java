package LeetCode50.移除元素;

public class Test01 {

	public static void main(String[] args) {
		int[] nums = new int[]{4,5} ;
		System.out.println(removeElement(nums,4)) ;
	}

	public static int removeElement(int[] nums, int val) {
		if(nums.length==0){
			return nums.length ;
		}

		int n = 0 ;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				n++ ;
				if(i<nums.length-1){
					int j = i + 1 ;
					while(j<nums.length){
						if(val!=nums[j]){
							n--;
							int temp = nums[i] ;
							nums[i] = nums[j] ;
							nums[j] = temp ;
							break ;
						}
						j++;
					}
				}
			}
		}

		return nums.length-1 ;
	}
}
