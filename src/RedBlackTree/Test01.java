package RedBlackTree;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		RBTree<Integer> tree = new RBTree<Integer>();
		// 循环随机放入10个数字
//		Random random = new Random() ;
//		for(int i=0;i<10;i++){
//			Integer num = random.nextInt(100);
//			tree.put(num) ;
//		}
		tree.put(61) ;
		tree.put(37) ;
		tree.put(16) ;
		tree.put(35) ;
		tree.put(31) ;
		tree.put(40) ;
		tree.put(47) ;
		tree.put(85) ;
		tree.put(68) ;
		tree.put(98) ;

		// 先序遍历
		//tree.traversalByPre();
		// 中序遍历
		//tree.traversalByMid();;
		// 后序遍历
		//tree.traversalByPos();
		// 深度遍历
		tree.traversaByDeep();
	}
}
