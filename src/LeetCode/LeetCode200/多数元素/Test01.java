package LeetCode.LeetCode200.多数元素;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {

    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1) ;
            }else{
                map.put(nums[i],map.get(nums[i])+1) ;
            }
        }

        int m = nums.length / 2;

        for(Map.Entry entry:map.entrySet()){
            if((Integer)entry.getValue()>m){
                return (Integer)entry.getKey() ;
            }
        }
        return 0 ;
    }
}
