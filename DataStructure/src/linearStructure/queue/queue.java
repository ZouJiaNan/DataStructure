package linearStructure.queue;

import linearStructure.tree.binaryTree.Node;
//队列，FIFO
public class queue {
    private static Node[] que;
    //头指针
    private static int first;
    //尾指针
    private static int last;
    //初始化
    static{
        que=new Node[100];
        first=0;
        last=-1;
    }

    //入队
    public static void Enter(Node node){
        que[++last]=node;
    }
    //出队
    public static Node exit(){
        Node node=que[first++];
        return node;
    }
    //判空
    public static boolean isEmpty(){
        return (que[first]==null&&first==last) ? true:false;
    }
}
