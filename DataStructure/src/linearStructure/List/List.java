package linearStructure.List;

public class List {
    //节点
    public class Node{
        //数据域
        Object data;
        //指针域
        Node next;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    //尾指针
    Node last;

    //遍历指针
    Node flag;

    //头节点
    Node header;

    //初始化头节点
    //初始化末尾指针
    public List(){
        this.header=new Node();
        this.header.setData("header");
        this.last=header;
    }

    //插入
    public void insert(Object data){
        Node newNode=new Node();
        newNode.setData(data);
        last.setNext(newNode);
        //指针后移
        last=newNode;
    }

    //指定位置插入
    //插入在指定节点的后面
    //header位序为0，依次类推
    //此方法无法实现直接挂在末尾，挂在末尾请用上面的无参insert()
    public void insert(int X,Object data){
        //遍历指针指向头节点
        this.flag=header;
        //计数器
        int i=0;

        Node newNode=new Node();
        newNode.setData(data);

        //查找动作
        while(i<X){
            flag=flag.getNext();
            i++;
        }
        //删除动作
        //后面节点挂在当前节点后
        newNode.setNext(flag.getNext());
        //当前节点挂在目标节点后
        flag.setNext(newNode);
    }

    //遍历打印链表
    public void printf(){
        //遍历指针指向头节点
        this.flag=header;
        //消息
        String message="";
        while (flag.getNext()!=null){
            message=message+flag.getData()+"—>";
            flag=flag.getNext();
        }
        //拼接最后一个节点
        message=message+flag.getData()+"—>";

        System.out.println(message);
    }

    //删除指定位序节点
    public void delete(int X){
        //遍历指针指向头节点
        this.flag=header;
        //计数器
        int i=0;

        //查找动作
        while(i<X-1){
            flag=flag.getNext();
            i++;
        }

        //删除动作
        flag.setNext(flag.getNext().getNext());

    }
}
