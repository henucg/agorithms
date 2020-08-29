package LeetCode200.最大间距;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(maximumGap(new int[]{3,6,9,1}));
    }

    public static int maximumGap(int[] nums) {
        if(nums==null || nums.length<2){
            return 0 ;
        }

        Arrays.sort(nums);

        int sub = Integer.MIN_VALUE ;
        for(int i=1;i<nums.length;i++){
            int n = nums[i]-nums[i-1] ;
            if(n>sub){
                sub = n ;
            }
        }

        return sub ;
    }
}
