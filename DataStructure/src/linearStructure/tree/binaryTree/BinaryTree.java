package linearStructure.tree.binaryTree;


import linearStructure.queue.queue;

import java.util.Scanner;
public class BinaryTree {

    //判断BT是否为空
    public static boolean isEmpty(Node root){
        //判断操作
        return  root==null?true:false;
    }


    //先序建树
    public static Node create(Node node,Scanner scanner){
        Integer data=Integer.parseInt(scanner.next());
        if(data!=-1){
            node=new Node();
            node.setData(data);
            node.setLeft(create(node,scanner));
            node.setRight(create(node,scanner));
        }
        //以防万一，如果节点为叶节点时，将其左右指针置空
        if(data==-1){
            node.setLeft(null);
            node.setRight(null);
        }
        return node;
    }

    //递归先序遍历二叉树
    public static void pre(Node node){
        //需要给节点增加一个遍历状态标志位
        //每次递归回溯时需要判断当前节点的标志位是否为已遍历状态
        //否则会徘徊在叶节点，堆栈溢出
        if(node!=null&!node.isOrder()){
            System.out.println(node.getData());
            node.setOrder(true);
            pre(node.getLeft());
            pre(node.getRight());
        }
    }

    //中序遍历
    public static  void mid(Node node){
        if(node!=null&!node.isOrder()){
            node.setOrder(true);
            mid(node.getLeft());
            System.out.println(node.getData());
            mid(node.getRight());
        }
    }

    //后续遍历
    public static void post(Node node){
        if(node!=null&!node.isOrder()){
            node.setOrder(true);
            mid(node.getLeft());
            mid(node.getRight());
            System.out.println(node.getData());
        }
    }

    //层序遍历
    public static void level(){
        //递归法
        if (!queue.isEmpty()) {
            //取出队首元素
            Node node = queue.exit();
            //打印节点数据
            System.out.println(node.getData());
            //左孩子入队
            queue.Enter(node.getLeft());
            //右孩子入队
            queue.Enter(node.getRight());

            level();
        }

        //循环法
        /*while (!queue.isEmpty()) {
            //取出队首元素
            Node node = queue.exit();
            //打印节点数据
            System.out.println(node.getData());
            //左孩子入队
            queue.Enter(node.getLeft());
            //右孩子入队
            queue.Enter(node.getRight());
        }*/
    }
}
