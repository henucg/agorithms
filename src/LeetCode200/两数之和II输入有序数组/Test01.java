package LeetCode200.两数之和II输入有序数组;

public class Test01 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15} ;
        int target = 9 ;

        System.out.println(twoSum(numbers,target));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2] ;

        int i = 0;
        int j = numbers.length - 1 ;

        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++ ;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                break ;
            }
        }

        if(i!=j){
            arr[0] = i ;
            arr[1] = j ;
        }

        return arr ;
    }
}
