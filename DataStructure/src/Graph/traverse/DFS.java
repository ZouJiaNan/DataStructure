package Graph.traverse;

import linearStructure.tree.binaryTree.Node;

public class DFS {
    //图
    static int[][] graph=new int[7][7];
    //访问记录
    static boolean[] isVisited=new boolean[7];
    static {
        graph[0][1]=1;graph[0][2]=1;graph[0][3]=1;
        graph[1][0]=1;graph[1][2]=1;
        graph[2][0]=1;graph[2][1]=1;graph[2][3]=1;graph[2][4]=1;graph[2][5]=1;
        graph[3][0]=1;graph[3][2]=1;graph[3][4]=1;
        graph[4][2]=1;graph[4][3]=1;
        graph[5][2]=1;
        graph[5][6]=1;
        graph[6][5]=1;
    }

    public static void DFS(int i){
        System.out.println(i);
        isVisited[i]=true;
        for(int j=0;j<graph[i].length;j++){
            if(graph[i][j]==1&&isVisited[j]==false){
                DFS(j);
            }
        }
    }

    public static void main(String[] args) {
        DFS(0);
    }
}
