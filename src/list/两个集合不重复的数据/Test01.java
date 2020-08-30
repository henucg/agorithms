package list.两个集合不重复的数据;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>() ;
		a.add(1) ;
		a.add(2) ;

		Set<Integer> b = new HashSet<Integer>() ;
		b.add(2) ;
		b.add(3) ;

		Set<Integer> a1 = new HashSet<Integer>(a) ;
		Set<Integer> b1 = new HashSet<Integer>(b) ;

		a1.removeAll(b) ;
		b1.removeAll(a) ;

		System.out.println(a1);
		System.out.println(b1);
	}
}
