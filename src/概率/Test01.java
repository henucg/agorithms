package 概率;

import java.util.Random;

/**
 *
 * 给一个函数，返回 0 和 1，概率为 p 和 1-p，
 * 请你实现一个函数，使得返回 01 概率一样
 *
 */

public class Test01 {
	public static void main(String[] args) {
		int r0 = 0 ;
		int r1 = 0 ;

		for (int i=0;i<500;i++){
			if(fun2()==0){
				r0 ++ ;
			}else{
				r1 ++ ;
			}
		}

		System.out.println(r0);
		System.out.println(r1);
	}

	/**
	 * 	初始化一个函数，返回0，1的概率是1/3和2/3
	 * @return
	 */
	public static int fun1(){
		//double a = Math.random() ;
		int a = new Random().nextInt(3) ;
		if(a>=1){
			return 1 ;
		}else{
			return 0 ;
		}
	}

	/**
	 * 返回0，1的概率都是1/2
	 * @return
	 */
	public static int fun2(){
		int a = fun1() ;
		int b = fun1() ;

		if(a == 0  && b == 1){
			return  0 ;
		}else if(a == 1 && b == 0){
			return 1 ;
		}else{
			return fun2() ;
		}
	}
}
