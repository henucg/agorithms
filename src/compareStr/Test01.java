package compareStr;

/**
 * 比较版本号大小算法
 * @author cg
 *
 */

public class Test01 {

	public static void main(String[] args) {
		System.out.println(geDescVersion("2","1.a")) ;
	}
	
	public static String geDescVersion(String version1,String version2) {
		if(version1 != null && !"".equals(version1) && version2!=null && !"".equals(version2)) {
			String[] v1 = version1.split("\\.");
			String[] v2 = version2.split("\\.");
			
			int length = 0 ;
			if(v1.length>v2.length) {
				length = v2.length ;
			}else {
				length = v1.length ;
			}
			
			for(int i = 0;i<length;i++) {
				if(v1[i].compareTo(v2[i]) > 0) {
					return version1 ;
				}else if(v1[i].compareTo(v2[i])<0) {
					return version2 ;
				}else if(i == length -1 ) {
					return  v1.length >v2.length?version1:version2;
				}
			}
			return null ;
		}else {
			return "error" ;
		}
	}
}
