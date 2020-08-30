package LeetCode.LeetCode200.多数元素;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0] ;
        }

        Arrays.sort(nums);

        int m = nums.length / 2 ;
        int n = 1 ;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                n++ ;
            }else{
                n = 1 ;
            }

            if(n>m){
                return nums[i] ;
            }
        }
        return 0 ;
    }
}
