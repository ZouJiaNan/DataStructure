package linearStructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * BFS，广度优先搜索，适用于非加权图。
 */

public class BFS {
    Map<String,String[]> map=new HashMap<>();
    LinkedList<String> queue;
    public void CreateGraph(){
       // Graph g1=new Graph("you",new String[]{"alice","bob","claire"});
        String[] 我=new String[]{"程序猿","产品经理","菜锦豪","简阅","罗诗雨"};
        String[] 菜锦豪=new String[]{"设计师","健身教练","我","简阅","罗诗雨"};
        String[] 简阅=new String[]{"护士姐姐","菜锦豪","我","罗诗雨"};
        String[] 罗诗雨=new String[]{"学生妹妹","菜锦豪","简阅","我"};
        map.put("我",我);
        map.put("菜锦豪",菜锦豪);
        map.put("简阅",简阅);
        map.put("罗诗雨",罗诗雨);

        queue=new LinkedList();
        queue.offerFirst("我");
    }

    public  void dfs(String target){
        if(!queue.isEmpty()) {
            String root=queue.pollFirst();
            String[] keys = map.get(root);
            if(keys!=null) {
                for (String key : keys) {
                    System.out.println(root+"找到了"+key);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (key.equals(target)) {
                        System.out.println("OJBK!!");
                        System.exit(0);
                    } else {
                        queue.offerLast(key);
                    }
                }
            }
            dfs(target);
        }
    }
}
