package tree.test01;

import java.util.Stack;

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

        System.out.println("先序遍历(非递归)：" + (str="") + getNodeByPre2(treeNode));
        System.out.println("中序遍历(非递归)：" + (str="") + getNodeByMiddle2(treeNode));
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
}
