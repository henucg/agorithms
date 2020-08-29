package tree.test01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 构建一棵树，然后实现各种遍历
 * @author chenge
 *
 */

public class TestDemo01 {

    public static String str = "" ;

    public static void main(String[] args){
        //构建树
        TreeNode treeNode = new TreeNode("A",
                new TreeNode("B",
                        new TreeNode("D",null,
                                new TreeNode("E",
                                        new TreeNode("H",null,null),null)),null),
                new TreeNode("C",
                        new TreeNode("F",
                                new TreeNode("G",null,null),null),null)) ;

        //遍历
        System.out.println("先序遍历：" + (str="") + getNodeByPre(treeNode));
        System.out.println("中序遍历：" + (str="") + getNodeByMiddle(treeNode));
        System.out.println("后序遍历：" + (str="") + getNodeByPri(treeNode));
        System.out.println("层序遍历：" + (str="") + getNodeByLevel(treeNode,null));

        System.out.println("先序遍历(非递归)：" + (str="") + getNodeByPre2(treeNode));
        System.out.println("中序遍历(非递归)：" + (str="") + getNodeByMiddle2(treeNode));
        
        System.out.println("层序遍历：" + (str="") + getNodeByLevel(treeNode));
        
        System.out.println("树的深度：" + getDeep(treeNode));
        
        //左右子树交换
        TreeNode node = changeNode(treeNode) ;
        System.out.println(node);

        System.out.println("后序遍历(非递归)：" + (str="") + getNodeByPri2(treeNode));
        System.out.println("层序遍历(非递归)：" + (str="") + getNodeByLevel2(treeNode));

    }

    /**
     * 先序遍历
     * @param node
     * @return
     */
    public static String getNodeByPre(TreeNode node){
        if(node != null){
            str += node.getRoot() ;

            if(node.getLeftNode()!=null){
                getNodeByPre(node.getLeftNode()) ;
            }
            if(node.getRightNode()!=null){
                getNodeByPre(node.getRightNode()) ;
            }
        }

        return str ;
    }

    /**
     * 中序遍历
     * @param node
     * @return
     */
    public static String getNodeByMiddle(TreeNode node){
        if(node != null){
            if(node.getLeftNode()!=null){
                getNodeByMiddle(node.getLeftNode()) ;
            }

            str += node.getRoot() ;

            if(node.getRightNode()!=null){
                getNodeByMiddle(node.getRightNode()) ;
            }
        }
        return str ;
    }

    /**
     * 后序遍历
     * @param node
     * @return
     */
    public static String getNodeByPri(TreeNode node){
        if(node != null){
            if(node.getLeftNode()!=null){
                getNodeByPri(node.getLeftNode()) ;
            }

            if(node.getRightNode()!=null){
                getNodeByPri(node.getRightNode()) ;
            }

            str += node.getRoot() ;
        }
        return str ;
    }

    /**
     * 层序遍历
     * @param node
     * @return
     */
    public static String getNodeByLevel(TreeNode node,Queue<TreeNode> q){
        if(node != null){
            Queue<TreeNode> queue = null ;
            if(q == null){
                queue = new LinkedList<TreeNode>();
            }else{
                queue = q ;
            }

            str += node.getRoot() ;

            if(node.getLeftNode()!=null){
                queue.add(node.getLeftNode()) ;
            }
            if(node.getRightNode()!=null){
                queue.add(node.getRightNode()) ;
            }

            if(!queue.isEmpty()){
                getNodeByLevel(queue.poll(),queue) ;
            }
        }
        return str ;
    }


    /**
     * 先序遍历非递归
     * @param node
     * @return
     */
    public static String getNodeByPre2(TreeNode node) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (node != null || !s.empty()) {
            while (node != null) {
                str += node.getRoot();
                s.push(node);
                node = node.getLeftNode();
            }
            if (!s.empty()) {
                node = s.pop();
                node = node.getRightNode();
            }
        }
        return str ;
    }

    /**
     * 中序遍历非递归
     * @param node
     * @return
     */
    public static String getNodeByMiddle2(TreeNode node){
        Stack<TreeNode> s = new Stack<TreeNode>() ;
        while(node!=null || !s.empty()){
            while(node!=null){
                s.push(node) ;
                node = node.getLeftNode() ;
            }

            if(!s.empty()){
                node = s.pop() ;
                str += node.getRoot() ;
                node = node.getRightNode() ;
            }
        }
        return str ;
    }
 
    /**
     * 层序遍历（递归）
     * @param node
     * @return
     */
    public static String getNodeByLevel(TreeNode node) {
    	if(node==null) {
    		return str ;
    	}
    	TreeNode root = node ;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
    	queue.offer(root) ;
    	while(!queue.isEmpty()) {
    		node = queue.poll() ;
    		str += node.getRoot() ;
    		
    		if(node.getLeftNode()!=null) {
    			queue.add(node.getLeftNode()) ;
    		}
    		
    		if(node.getRightNode()!=null) {
    			queue.add(node.getRightNode()) ;
    		}
    	}
    	
    	return str ;
    }
    
    /**
     * 获取树的深度（递归）
     * @param node
     * @return
     */
    public static int getDeep(TreeNode node) {
    	if(node==null) {
    		return 0 ;
    	}
    	
    	int l = getDeep(node.getLeftNode()) ;
    	int r = getDeep(node.getRightNode()) ;
    	
    	return l>r?l+1:r+1;
    }
    
    /**
     * 左右子树相互交换
     * @param node
     * @return
     */
    public static TreeNode changeNode(TreeNode node) {
    	if(node==null) {
    		return null ;
    	}
    	
    	TreeNode temp = node.getLeftNode() ;
    	node.setLeftNode(node.getRightNode());
    	node.setRightNode(temp);
    	
    	changeNode(node.getLeftNode()) ;
    	changeNode(node.getRightNode()) ;
    	
    	return node ;
    }

    /**
     * 后续遍历非递归
     * @param treeNode
     * @return
     */
    public static String getNodeByPri2(TreeNode treeNode){
        if(treeNode!=null) {
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            while(treeNode!=null){
                if(treeNode.getLeftNode()!=null){
                    q.add(treeNode.getLeftNode()) ;
                }

                if(treeNode.getRightNode()!=null){
                    q.add(treeNode.getRightNode()) ;
                }

                q.add(treeNode) ;

                treeNode = q.poll() ;

                str += treeNode.getRoot() ;
            }
        }
        return str ;
    }

    /**
     * 层序遍历非递归
     * @param node
     * @return
     */
    public static String getNodeByLevel2(TreeNode node){
        if(node!=null){
            Queue<TreeNode> q = new LinkedList<TreeNode>() ;
            while(node != null) {
                str += node.getRoot();

                if(node.getLeftNode()!=null){
                    q.add(node.getLeftNode()) ;
                }
                if(node.getRightNode()!=null){
                    q.add(node.getRightNode()) ;
                }

                node = q.poll() ;
            }
        }
        return str ;
    }
}
