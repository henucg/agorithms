package tree.二叉树遍历;

/**
 * 树类
 */

public class TreeNode {
    private String root ;           //根
    private TreeNode leftNode ;     //左子树
    private TreeNode rightNode ;    //右子树

    public TreeNode(String root,TreeNode leftNode,TreeNode rightNode){
        this.root = root ;
        this.leftNode = leftNode ;
        this.rightNode = rightNode ;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
