package LeetCode200.比较版本号;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.1","1.01.0"));
    }

    public static int compareVersion(String version1, String version2) {
        if(version1==null || version2==null){
            return 0 ;
        }

        if(version1.equals(version2)){
            return 0 ;
        }

        String[] str1 = version1.split("\\.") ;
        String[] str2 = version2.split("\\.") ;

        int length = Math.min(str1.length,str2.length) ;

        for(int i=0;i<length;i++){
            int v1 = Integer.parseInt(str1[i]) ;
            int v2 = Integer.parseInt(str2[i]) ;

            if(v1>v2){
                return 1 ;
            }else if(v1<v2){
                return -1 ;
            }
        }

        if(str1.length>str2.length){
            for(int i=str2.length;i<str1.length;i++){
                int n = Integer.parseInt(str1[i]) ;
                if(n!=0){
                    return 1 ;
                }
            }
            return 0 ;
        }else if(str1.length<str2.length){
            for(int i=str1.length;i<str2.length;i++){
                int n = Integer.parseInt(str2[i]) ;
                if(n!=0){
                    return -1;
                }
            }
            return 0 ;
        }else{
            return 0 ;
        }
    }
}
