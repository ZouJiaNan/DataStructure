package linearStructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * NP-hard：局部情况中存在有效解
 * Dijkstra，适用于加权图
 */
public class Dijkstra {
    private Map<String,DijkstraNode[]> map=new HashMap<>();
    private LinkedList<String> queue;
    private int temp=Integer.MAX_VALUE;
    private int count=0;
    private DijkstraNode NextStation;
    private String notes="";
    public void CreateGraph(){
        //起点及其边
        DijkstraNode[] start=new DijkstraNode[]{
                new DijkstraNode("A",6),
                new DijkstraNode("B",2)};
        //A点及边
        DijkstraNode[] A=new DijkstraNode[]{
                new DijkstraNode("end",1)};
        //B点及其边
        DijkstraNode[] B=new DijkstraNode[]{
                new DijkstraNode("A",3),
                new DijkstraNode("end",5)};

        //终点及其边
        DijkstraNode[] end=new DijkstraNode[]{
                new DijkstraNode("B",5)};

        map.put("start",start);
        map.put("A",A);
        map.put("B",B);
        map.put("end",end);

        queue=new LinkedList();
        //起点入队
        queue.offerFirst("start");
    }

    public  void dijkstra(){
        //队列判空，队列空为递归出口
        if(!queue.isEmpty()) {
            //弹出队首节点
            String root = queue.pollFirst();
            DijkstraNode[] nodes = map.get(root);
            //判断是否到达终点
            if (!"end".equals(root)) {
                //判断节点是否有相邻节点
                if (nodes != null) {
                    //遍历查找相邻最近节点
                    for (DijkstraNode node : nodes) {
                        if (temp > node.getDistance()) {
                            temp = node.getDistance();
                            NextStation=node;
                        }
                    }
                    //下一节点（相邻最近节点）入队
                    queue.offerFirst(NextStation.getName());
                    //记录路程
                    count += temp;
                    notes+=root+"("+temp+"km)"+"->";
                    temp = Integer.MAX_VALUE;
                    dijkstra();
                }
            }
        }
    }

    public String getResult(){
        return notes+"总路程:"+this.count+"km";
    }
}
