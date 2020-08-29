package LeetCode200.多数元素;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2] ;
    }
}
