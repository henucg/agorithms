package Arrays;

import java.util.Arrays;

/**
 * Arrays实现排序
 * 不许是数组才能使用Arrays.sorts()排序
 * 如果是字符串数组，就按字母升序，大写字母优先
 * 如果是数字数组，就按数字大小升序
 */
public class Test01 {
	public static void main(String[] args) {

		String[] s = {"A","a","Ba","BA","bA","ba","aaaa","ca"} ;
		Arrays.sort(s);

		Arrays.stream(s).forEach(s1 -> System.out.println(s1));

		int[] i = {2,4,6,8,10,1,3,5,7,9} ;
		Arrays.sort(i);
		Arrays.stream(i).forEach(i1 -> System.out.println(i1));
	}
}
