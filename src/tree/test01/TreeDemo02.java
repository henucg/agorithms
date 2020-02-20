package tree.test01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeDemo02 {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode("5",
				new TreeNode("2",
						new TreeNode("1",null,null),
						new TreeNode("3",
								null,new TreeNode("4",null,null))),

				new TreeNode("7",
						new TreeNode("6",null,null),null)) ;

		//firstSearch(tree);
		//System.out.println("");
		//firstSearch2(tree);

		//middleSearch(tree);
		//System.out.println("");
		//middleSearch2(tree);

		//lastSearch(tree);
		System.out.println("");
		//lastSearch2(tree);

	}

	/**
	 * 先序遍历递归
	 * @param tree
	 */
	public static void firstSearch(TreeNode tree){
		if(tree==null){
			return ;
		}

		System.out.print(tree.getRoot() + "	");

		if(tree.getLeftNode()!=null){
			firstSearch(tree.getLeftNode());
		}

		if(tree.getRightNode()!=null){
			firstSearch(tree.getRightNode());
		}
	}

	/**
	 * 中序遍历递归
	 * @param tree
	 */
	public static void middleSearch(TreeNode tree){
		if(tree==null){
			return ;
		}

		if(tree.getLeftNode()!=null){
			middleSearch(tree.getLeftNode());
		}

		System.out.print(tree.getRoot() + "	");

		if(tree.getRightNode()!=null){
			middleSearch(tree.getRightNode());
		}
	}

	/**
	 * 后序遍历递归
	 * @param tree
	 */
	public static void lastSearch(TreeNode tree){
		if(tree==null){
			return ;
		}

		if(tree.getLeftNode()!=null){
			lastSearch(tree.getLeftNode());
		}

		if(tree.getRightNode()!=null){
			lastSearch(tree.getRightNode());
		}

		System.out.print(tree.getRoot() + "	");
	}

	/**
	 * 先序遍历非递归
	 * @param tree
	 */
	public static void firstSearch2(TreeNode tree){
		if(tree==null){
			return ;
		}

		Stack<TreeNode> stack = new Stack<>() ;

		while(tree!=null) {
			System.out.print(tree.getRoot() + "	");

			if (tree.getLeftNode() != null) {
				if (tree.getRightNode() != null) {
					stack.push(tree.getRightNode());
				}

				tree = tree.getLeftNode();
			} else if(tree.getRightNode()!=null) {
				tree = tree.getRightNode() ;
			} else if(!stack.empty()) {
				tree = stack.pop() ;
			} else {
				tree = null ;
			}
		}
	}

	/**
	 * 中序遍历非递归
	 * @param tree
	 */
	public static void middleSearch2(TreeNode tree){
		if(tree==null){
			return  ;
		}

		Stack<TreeNode> stack = new Stack<>() ;

		while(tree!=null || !stack.empty()){
			if(tree!=null){
				stack.push(tree) ;
				tree = tree.getLeftNode() ;
			}else{
				TreeNode node = stack.pop() ;
				System.out.print(node.getRoot() + "	");
				tree = node.getRightNode()
 ;			}
		}
	}

	/**
	 * 后序遍历非递归
	 * @param tree
	 */
	public static void lastSearch2(TreeNode tree){
		if(tree==null){
			return ;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
		while(tree!=null){
			if(tree.getLeftNode()!=null){
				queue.add(tree.getLeftNode()) ;
			}
			if(tree.getRightNode()!=null){
				queue.add(tree.getRightNode()) ;
			}
			queue.add(tree) ;

			tree = queue.poll() ;
			System.out.print(tree.getRoot() + "	");
		}
	}
}
