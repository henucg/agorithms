package tools.字母转大写;

/**
 * 首字母转大写的几个方法
 */

public class Test01 {
	public static void main(String[] args){
		String s = "7778  asD	sa	d  as      9	9 9    ";

		//System.out.println(upperFirstCase1(s));
		System.out.println(upperFirstCase2(s));
	}

	/**
	 * toUpperCase方法（不能解决中间有多个空格的问题）
	 * @param str
	 * @return
	 */
	public static String upperFirstCase1(String str){
		String[] split = str.split("\\s+");

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < split.length; i++) {
			char[] ch = split[i].toCharArray();
			ch[0] = Character.toUpperCase(ch[0]);

			sb.append(new String(ch));
			sb.append(" ");
		}
		return sb.toString() ;
	}

	/**
	 * 字符串之间可以有多个空格，兼容Tab键
	 * @param str
	 * @return
	 */
	public static String upperFirstCase2(String str){
		StringBuilder s = new StringBuilder("");
		if(str != null && !"".equals(str)){
			for (int i = 0; i < str.length(); i++) {
				if(i==0 && str.charAt(i) != 32){
					s.append(Character.toUpperCase(str.charAt(i)));
				}else if((int) str.charAt(i) != 32 && ((int) str.charAt(i-1) == 32 || (int) str.charAt(i-1) == 9)) {
					s.append(Character.toUpperCase(str.charAt(i)));
				}else{
					s.append(str.charAt(i));
				}
			}
		}
		return s.toString() ;
	}
}
