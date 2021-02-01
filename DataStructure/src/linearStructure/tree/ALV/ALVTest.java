package linearStructure.tree.ALV;
import linearStructure.queue.queue;
import linearStructure.tree.binaryTree.Node;

public class ALVTest {
    public static void main(String[] args) {
        ALV.insert(new Node(4));
        ALV.insert(new Node(5));
        ALV.insert(new Node(2));
        ALV.insert(new Node(3));
        ALV.insert(new Node(7));
        ALV.insert(new Node(1));
        queue.Enter(ALV.getRoot());
        ALV.level();
    }
}
