package LeetCode.LeetCode200.翻转字符串里的单词;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {

	}

	public static String reverseWords(String s) {
		// 去掉前后两边的空格
		s = s.trim() ;

		// 正则表达式多个空格作为分隔符
		List<String> list = Arrays.asList(s.split("\\s+")) ;

		Collections.reverse(list);

		return String.join(" ",list) ;
	}
}
