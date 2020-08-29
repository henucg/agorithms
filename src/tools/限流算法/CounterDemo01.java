package 限流算法;

/**
 * 计数器算法
 * 一个时间段内只允许一定数量的请求
 * 这个算法最大的问题就是有边界问题
 */
public class CounterDemo01 {

	private static int num = 100 ;		// 设置允许请求数量

	private static long time = 1000 ;	// 设置时间段

	private static int count = 0 ;		//统计请求次数

	private static long currentTimeStamp = getTimeNow() ;

	/**
	 * 获取当前时间
	 * @return
	 */
	private static long getTimeNow(){
		return System.currentTimeMillis() ;
	}

	/**
	 * 计算是否限流
	 * @return
	 */
	public static boolean count(){
		long nowTime = getTimeNow() ;
		if(nowTime - currentTimeStamp < time){
			if(count > num){
				// 限流
				return false ;
			}else{
				count ++ ;
				// 不限流
				return true ;
			}
		}else{
			currentTimeStamp = nowTime ;
			count = 1 ;
			//不限流
			return true ;
		}
	}

	public static void main(String[] args) {

	}
}
