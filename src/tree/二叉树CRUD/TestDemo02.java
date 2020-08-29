package tree.test02;

/**
 * 实现二叉树的增删改查等
 * 
 * @author chenge
 *
 */

public class TestDemo02 {

	public static void main(String[] args) {

	}

	/**
	 * 添加数据
	 * 
	 * @param str
	 * @param tree
	 */
	public static void add(Integer num, TreeNode tree) {
		if (tree == null) {
			return;
		}

		if (tree.getRoot() > num) {
			// 添加到左子树
			if (tree.getLeft() == null) {
				TreeNode t = new TreeNode();
				t.setRoot(num);

				tree.setLeft(t);
			} else {
				add(num, tree.getLeft());
			}
		} else {
			// 添加到右子树
			if (tree.getRight() == null) {
				TreeNode t = new TreeNode();
				t.setRoot(num);

				tree.setRight(t);
			} else {
				add(num, tree.getRight());
			}
		}
	}
}
