package linearStructure.tree.binaryTree;
import linearStructure.queue.queue;
import java.util.Scanner;

public class btTest {
    public static void main(String[] args) {
        Node root=null;
        Scanner scanner=new Scanner(System.in);
        //前序建树
        root=BinaryTree.create(root,scanner);

        //后续遍历
        BinaryTree.post(root);

        //层序遍历
        //入队
        //queue.Enter(root);
        //BinaryTree.level();
    }
}
