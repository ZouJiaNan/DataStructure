package linearStructure.List;

public class ListTest {
    public static void main(String[] args) {
        List list=new List();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(2,3);
        list.delete(2);
        list.printf();
    }
}
