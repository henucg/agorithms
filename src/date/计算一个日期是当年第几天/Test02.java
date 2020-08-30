package date.计算一个日期是当年第几天;

/**
 * 日期格式必须是yyyy-mm-dd
 * 日期格式校验省略
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(getDayOfYear("2019-08-21"));
	}

	/**
	 * 计算一个日期是当年的第几天，省略格式校验
	 * @param date yyyy-mm-dd
	 * @return
	 */
	public static int getDayOfYear(String date) {
		String[] ymd = date.split("-") ;

		int year = Integer.parseInt(ymd[0]) ;
		int month = Integer.parseInt(ymd[1]) ;
		int day = Integer.parseInt(ymd[2]);

		// 判断是否是闰年
		boolean flag = false ;
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
			flag = true ;
		}

		int days = 0 ;

		switch(month){
			case 1:{};break;
			case 2:{ days = 31 ; };break;
			case 3:{ days = 31 + 28 ;};break;
			case 4:{ days = 31*2 + 28 ;};break;
			case 5:{ days = 31*2 + 30 + 28 ;};break;
			case 6:{ days = 31*3 + 30 + 28 ;};break;
			case 7:{ days = 31*3 + 30*2 + 28 ;};break;
			case 8:{ days = 31*4 + 30*2 + 28 ;};break;
			case 9:{ days = 31*5 + 30*2 + 28 ;};break;
			case 10:{ days = 31*5 + 30*3 + 28 ;};break;
			case 11:{ days = 31*6 + 30*3 + 28 ;};break;
			case 12:{ days = 31*6 + 30*4 + 28 ;};break;
		}
		if(flag) {
			days += day + 1;
		}else{
			days += day ;
		}

		return days ;
	}
}
