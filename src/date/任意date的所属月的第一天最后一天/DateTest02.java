package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 计算任意date的所属月的第一天、最后一天
 * @author chenge
 *
 */

public class DateTest02 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss") ;
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYYMM") ;
		
		Date first = firstDay(new Date()) ;
		Date last = lastDay(new Date()) ;
		
		System.out.println(sdf.format(first));
		System.out.println(sdf.format(last));
		
		try {
			Date d = sdf2.parse("201912") ;
			System.out.println(sdf.format(firstDay(d)));
			System.out.println(sdf.format(lastDay(d)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 当月第一天
	 * @param date
	 * @return
	 */
	public static Date firstDay(Date date) {
		if(date==null) {
			return null;
		}
		
		Calendar calendar = Calendar.getInstance() ;
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime() ;
	} 
	
	/**
	 * 当月最后一天
	 * @param date
	 * @return
	 */
	public static Date lastDay(Date date) {
		if(date==null) {
			return null;
		}
		
		Calendar calendar = Calendar.getInstance() ;
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime() ;
	}
}
