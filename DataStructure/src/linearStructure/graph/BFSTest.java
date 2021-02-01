package linearStructure.graph;

import java.util.Scanner;

public class BFSTest {
    public static void main(String[] args) {
        BFS d=new BFS();
        d.CreateGraph();
        System.out.println("请输入要在社交关系中查找的对象：");
        Scanner sc=new Scanner(System.in);

        d.dfs(sc.next());
    }
}
