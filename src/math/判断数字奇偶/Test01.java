package 判断数字奇偶;

/**
 * 判断数字是否是奇数
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(isOdd(-11));
		System.out.println(isOdd2(-11));
		System.out.println(isOdd3(-11));
	}

	/**
	 * 	第一种写法（未考虑到整数范围）
	 * @param i
	 * @return
	 */
	public static boolean isOdd(int i){
		return i%2==1 ;
	}

	/**
	 * 弥补第一种的问题
	 * 即使是负数，只要是奇数结果也不会等于0
	 * @param i
	 * @return
	 */
	public static boolean isOdd2(int i){
		return i%2!=0 ;
	}

	/**
	 * 弥补%的资源浪费问题
	 * 本质上是取最后一位与1做与运算，最后一位为1的话一定是奇数
	 * 与1做与运算一定为0
	 * @param i
	 * @return
	 */
	public static boolean isOdd3(int i){
		return (i&1)!=0 ;
	}
}
