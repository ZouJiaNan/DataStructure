package linearStructure.tree.binaryTree;

public class Node {
    //数据域
    private int data;
    //指针域
    private Node left;
    private Node right;

    //遍历标志
    private boolean isOrder;

    {
        isOrder=false;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean isOrder() {
        return isOrder;
    }

    public void setOrder(boolean order) {
        isOrder = order;
    }
}
