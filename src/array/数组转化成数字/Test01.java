package array.数组转化成数字;

public class Test01 {

	public static void main(String[] args) throws Exception {
		char[] chars = new char[]{'1','2','3','4','5','6','7','8','1','2','3','4','5','6','7','8','1','2','3','4','5','6','7','8'} ;
		System.out.println(toNum(chars));
	}

	public static Long toNum(char[] chars)throws Exception{
		if(chars.length<1){
			throw new Exception("异常字符") ;
		}

		Long n = 0L ;
		Long m = 1L ;
		for(int i=chars.length-1;i>=0;i--){
			try {
				Long k = Long.parseLong(chars[i] + "");
				n = n + (m * k) ;
				m = m * 10 ;
			}catch(Exception e){
				throw new Exception("异常字符1") ;
			}
		}

		return n ;
	}
}
