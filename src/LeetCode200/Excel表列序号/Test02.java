package LeetCode200.Excel表列序号;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZA"));
    }

    public static int titleToNumber(String s) {
        int sum = 0 ;
        for(int i=0;i<s.length();i++){
            int m = s.charAt(i) - 'A' + 1 ;
            sum = sum * 26 + m ;
        }
        return sum ;
    }
}
