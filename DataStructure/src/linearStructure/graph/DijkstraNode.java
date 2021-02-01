package linearStructure.graph;

public class DijkstraNode {
    private String name;
    private int distance;
    public DijkstraNode(String name,int distance){
        this.name=name;
        this.distance=distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
