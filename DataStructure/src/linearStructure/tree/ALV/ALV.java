package linearStructure.tree.ALV;

import linearStructure.queue.queue;
import linearStructure.tree.binaryTree.Node;

public class ALV {
    private static Node root=null;
    private static Node flag=null;
    public static void insert(Node node){
        if(root==null){
            System.out.println("我插入"+node.getData()+"作为根节点");
            root=node;
        }

        flag=root;

        while (node.getData()<flag.getData()){
            if(flag.getLeft()==null) {
                System.out.println("我在"+flag.getData()+"右边插入一个"+node.getData());
                flag.setLeft(node);
            }
            flag = flag.getLeft();
        }

        while(node.getData()>flag.getData()){
            if(flag.getRight()==null) {
                System.out.println("我在"+flag.getData()+"右边插入一个"+node.getData());
                flag.setRight(node);
            }
            flag = flag.getRight();
        }

    }

    public static Node getRoot(){
        return root;
    }

    //层序遍历
    public static void level(){
        //循环法
        while (!queue.isEmpty()) {
            //取出队首元素
            Node node = queue.exit();
            //打印节点数据
            if(node!=null) {
                System.out.println(node.getData());
                //左孩子入队
                queue.Enter(node.getLeft());
                //右孩子入队
                queue.Enter(node.getRight());
            }
        }
    }
}
