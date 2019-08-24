package 计算一个日期是当年第几天;

/**
 * 日期格式必须是yyyy-mm-dd
 * 日期格式校验省略
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(getDayOfYear("2019-08-21"));
	}

	/**
	 * 计算一个日期是当年的第几天，省略格式校验
	 * @param date yyyy-mm-dd
	 * @return
	 */
	public static int getDayOfYear(String date){
		int[] days = {0,0,31,59,90,120,151,181,212,243,273,304,334} ;

		int y = Integer.parseInt(date.substring(0,4)) ;
		int m = Integer.parseInt(date.substring(5,7)) ;
		int d = Integer.parseInt(date.substring(8,10)) ;

		int leap = 0 ;
		// 计算是否是闰年
		if(m>2 && (y%400==0 || (y%4==0 && y%100!=0))){
			leap++ ;
		}

		return days[m] + d + leap ;
	}
}
