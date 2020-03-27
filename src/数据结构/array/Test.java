package 数据结构.array;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		MyArray arr = new MyArray(3) ;

		arr.add(2);
		arr.add(34);
		arr.add(15);

		arr.searchAll();

		System.out.println("");
		arr.delete(1);
		arr.searchAll();


		System.out.println("");
		arr.add(33);
		arr.searchAll();
	}
}
