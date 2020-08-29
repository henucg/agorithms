package LeetCode200.Excel表列名称;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int n) {
        String[] arr = new String[]{"A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"} ;
        if(n<=26){
            return arr[n-1] ;
        }

        StringBuilder sb = new StringBuilder("") ;
        while(n>0){
            int i = n / 26 ;
            int j = n % 26 ;
            if(j!=0){
                sb.append(arr[j-1]) ;
            }
            n = i ;
        }
        return sb.reverse().toString() ;
    }
}
