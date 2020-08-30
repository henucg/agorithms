package tree.红黑树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RBTree<T extends Comparable<T>> {

	TreeNode rootNode = null ;

	/**
	 * 添加操作
	 * @param value
	 * @return
	 */
	public TreeNode put(T value){
		if(value==null){
			return null ;
		}
		if(rootNode==null){
			// 如果没有根结点，那么新添加的数据就是根结点，并且置为黑色
			TreeNode node  = new TreeNode() ;
			node.setValue(value);
			node.setRed(false);

			rootNode = node ;
			return rootNode ;
		}else{
			TreeNode temp = rootNode ;
			while(temp!=null){
				if(value.compareTo((T) temp.getValue())<0){
					// 放到左子树
					if(temp.getLeftTree()==null){
						TreeNode node = new TreeNode();
						node.setValue(value);

						temp.setLeftTree(node);
						return node ;
					}else{
						temp = temp.getLeftTree();
					}
				}else if(value.compareTo((T) temp.getValue())>0){
					// 放到右子树
					if(temp.getRightTree()==null){
						TreeNode node = new TreeNode();
						node.setValue(value);

						temp.setRightTree(node);
						return node ;
					}else{
						temp = temp.getRightTree();
					}
				}

				// 旋转与染色功能暂未实现，目前相当于一个二叉树
			}
		}
		return null ;
	}

	/**
	 * 查找操作
	 * @param value
	 * @return
	 */
	public TreeNode get(T value){
		if(rootNode==null){
			return null ;
		}else{
			TreeNode temp = rootNode ;
			while (temp!=null){
				if(value.compareTo((T) temp.getValue())<0){
					temp = temp.getLeftTree();
				}else if(value.compareTo((T) temp.getValue())>0){
					temp = temp.getRightTree();
				}else{
					return temp ;
				}
			}
		}
		return null ;
	}

	/**
	 * 先序遍历
	 */
	public void traversalByPre(){
		if(rootNode!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode temp = rootNode ;
			while(temp!=null){
				System.out.println(temp.getValue());

				if(temp.getLeftTree()!=null){
					// 右子树入栈
					if(temp.getRightTree()!=null) {
						stack.push(temp.getRightTree());
					}
					temp = temp.getLeftTree();
				}else if(temp.getRightTree()!=null){
					temp = temp.getRightTree() ;
				}else{
					if(!stack.empty()) {
						temp = stack.pop();
					}else{
						temp = null ;
					}
				}
			}
		}
	}

	/**
	 * 中序遍历
	 */
	public void traversalByMid(){
		if(rootNode!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>() ;
			boolean flag = true ;
			TreeNode temp = rootNode ;
			while(temp!=null){
				if(temp.getLeftTree()!=null && flag){
					stack.push(temp) ;
					temp = temp.getLeftTree() ;
				}else{
					System.out.println(temp.getValue());
					if(temp.getRightTree()!=null){
						temp = temp.getRightTree() ;
						flag = true ;
					}else if(!stack.empty()){
						temp = stack.pop() ;
						flag = false ;
					}else{
						temp = null ;
					}
				}
			}
		}
	}

	/**
	 * 后序遍历
	 */
	public void traversalByPos(){

	}

	/**
	 * 深度遍历
	 */
	public void traversaByDeep(){
		if(rootNode!=null){
			TreeNode temp = rootNode ;
			Stack<TreeNode> stack = new Stack<TreeNode>() ;
			while(temp!=null){
				System.out.println(temp.getValue());
				if(temp.getLeftTree()!=null){
					if(temp.getRightTree()!=null) {
						stack.push(temp.getRightTree());
					}
					temp = temp.getLeftTree() ;
				}else if(temp.getRightTree()!=null){
					temp = temp.getRightTree() ;
				}else if(!stack.empty()){
					temp = stack.pop() ;
				}else{
					temp = null ;
				}
			}
		}
	}
}
