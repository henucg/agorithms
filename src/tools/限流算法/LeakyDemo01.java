package tools.限流算法;

/**
 * 漏桶算法
 */
public class LeakyDemo01 {

	// 定义桶初始容量
	private static int capacity = 200 ;
	// 定义漏水速度
	private static int rate = 1 ;
	// 累计水量
	private static int water ;
	// 当前时间
	private static long timeStamp = getTimeNow() ;

	/**
	 * 获取当前时间
	 * @return
	 */
	public static long getTimeNow(){
		return System.currentTimeMillis() ;
	}

	/**
	 * 判断是否限流
	 * @return
	 */
	public static boolean grant(){
		long nowTime = getTimeNow() ;
		// 执行漏水操作
		water = Math.max(0,water - (int)(nowTime-timeStamp)*rate) ;
		timeStamp = nowTime ;
		if((water+1) > capacity){
			// 限流
			return false ;
		}else{
			water++ ;
			// 不限流
			return true ;
		}
	}

}
