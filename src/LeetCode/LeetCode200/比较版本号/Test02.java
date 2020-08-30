package LeetCode.LeetCode200.比较版本号;

public class Test02 {
    public static void main(String[] args) {

    }

    public static int compareVersion(String version1, String version2){
        if(version1==null || version2==null){
            return 0 ;
        }

        String[] ver1 = version1.split("\\.") ;
        String[] ver2 = version2.split("\\.") ;

        int ver1Length = ver1.length ;
        int ver2Length = ver2.length ;

        int m,n ;
        for(int i=0;i<Math.max(ver1Length,ver2Length);i++){
            m = i < ver1Length ? Integer.parseInt(ver1[i]) : 0 ;
            n = i < ver2Length ? Integer.parseInt(ver2[i]) : 0 ;

            if(m!=n){
                return m > n ? 1 : -1 ;
            }
        }

        return 0 ;
    }
}
