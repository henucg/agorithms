package 交替打印奇偶数;

public class Test01 {

	public static void main(String[] args){
		Object lock = new Object() ;

		PrintNumber p1 = new PrintNumber(true,lock) ;
		PrintNumber p2 = new PrintNumber(false,lock) ;

		Thread t1 = new Thread(p1) ;
		Thread t2 = new Thread(p2) ;

		t1.start();
		t2.start();
	}
}
