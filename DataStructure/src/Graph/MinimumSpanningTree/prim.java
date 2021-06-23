package Graph.MinimumSpanningTree;

public class prim {
    private String test_remote;
    static int[][] graph;
    static int[] dist;
    static int[] path=new int[7];
    static boolean[] isUsed=new boolean[7];
    static {
        graph=new int[][]{
                {0,1,4,3,0,0,0},
                {1,0,3,0,0,0,0},
                {4,3,0,2,1,5,0},
                {3,0,2,0,2,0,0},
                {0,0,1,2,0,0,0},
                {0,0,5,0,0,0,2},
                {0,0,0,0,0,2,0}
        };
        dist=new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
    }
    public static void prim(){
        while(true){
            //判断节点是否已经全部纳入
            if(isOver()){
                break;
            }
            //寻找未纳入的节点中距离树最近的节点
            int i=findRecently();
            //设置为已遍历状态
            isUsed[i]=true;
            //遍历该节点邻接节点
            for (int j=0;j<graph[i].length;j++) {
                if(graph[i][j]!=0&&isUsed[j]==false){
                    //更新邻接节点的dist、path
                    flashDistAndPath(i,j);
                }
            }
        }
    }

    public static int findRecently(){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<dist.length;i++){
            if(min>dist[i]&&isUsed[i]==false){
                min=dist[i];
                index=i;
            }
        }
        return index;
    }

    public static void flashDistAndPath(int i,int j){
        if (graph[i][j] < dist[j]) {
            dist[j] = graph[i][j];
            path[j] = i;
        }
    }

    public static boolean isOver(){
        int trues=0;
        for (boolean isused:isUsed) {
            if(isused==true){
                trues++;
            }
        }
        if(trues==dist.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isUsed[0]=true;
        dist[1]=1;
        path[1]=0;

        prim();
        for (int i=0;i<dist.length;i++){
            System.out.println(dist[i]);
        }
    }
}
