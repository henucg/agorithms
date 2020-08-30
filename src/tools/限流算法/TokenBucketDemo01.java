package tools.限流算法;

/**
 * 令牌桶算法
 */
public class TokenBucketDemo01 {

	// 定义桶容量
	private static int capacity = 200 ;
	// 令牌放入速度
	private static int rate = 1 ;
	// 当前令牌数量
	private static int tokens = 0 ;
	// 当前时间
	private static long timeStamp = getNowTime() ;

	/**
	 * 获取当前时间
	 * @return
	 */
	public static long getNowTime(){
		return System.currentTimeMillis() ;
	}

	/**
	 * 判断是否限流
	 * @return
	 */
	public static boolean grant(){
		long nowTime = getNowTime() ;
		// 添加令牌操作
		tokens = Math.min(capacity,tokens + (int)(nowTime - timeStamp) * rate) ;
		timeStamp = nowTime ;
		if(tokens<1){
			// 获取不到令牌，限流
			return false;
		}else{
			// 不限流
			tokens-- ;
			return true ;
		}
	}
}
