package linearStructure.graph;

public class DijkstraTest {
    public static void main(String[] args) {
        Dijkstra d=new Dijkstra();
        d.CreateGraph();
        d.dijkstra();
        System.out.println(d.getResult());
    }
}
