package RedBlackTree;

/**
 * 红黑树节点定义
 * @param <T>
 */
public class TreeNode <T extends Comparable<T>> {
	private T value ;
	private TreeNode leftTree ;
	private TreeNode rightTree ;
	private boolean red = true ;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode getLeftTree() {
		return leftTree;
	}

	public void setLeftTree(TreeNode leftTree) {
		this.leftTree = leftTree;
	}

	public TreeNode getRightTree() {
		return rightTree;
	}

	public void setRightTree(TreeNode rightTree) {
		this.rightTree = rightTree;
	}

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}
}
