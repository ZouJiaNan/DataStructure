package linearStructure.Array;

import sun.security.util.Length;

import javax.sound.midi.Soundbank;

/**
 * 顺序表
 */
public class Array{
    private Object[] array;
    private int maxSize;
    //初始化一个空数组
    public void initArray(int maxSize){
        this.maxSize=maxSize;
        array=new Object[maxSize];
    }


    //查找位序为K的元素
    public  Object findKth(int K){
        return array[K];
    }


    //查找元素X第一次出现的位置
    public  int find(Object X){
        int i=0;
        while(!X.equals(array[i])){
            i++;
        }
        return i;
    }

    //查找最后一个非空元素位置的位序
    public int findLastTh(Object[] targetArray){
        int i=0;
        for (int j=0;j<targetArray.length;j++){
            if(array[j]!=null){
                i=j;
            }
        }
        return i;
    }

    //在i位序插入一个元素
    public void insert(Object X,int i){
        System.out.println("当前数组的容量:"+array.length);
        //判断是否存满，是否需要追加空间。
        if(isFull()){
            newSpace();
        }

        //若插入位置上没有元素则直接插入
        if(array[i]==null){
            array[i]=X;
        }
        else
        //若插入位置上有元素则当前位置开始顺序后移一位
        {
            for (int j = findLastTh(array); j >= i; j--) {
                array[j + 1] = array[j];
            }
            array[i] = X;
        }
    }


    //判断数组是否已经存满
    public boolean isFull(){
        return array[array.length-1]!=null ? true:false;
    }

    //为数组开辟新空间
    public void newSpace(){
        //copy原数组
        Object[] tempArry=this.array;
            //记录原数组
        //追加新空间,追加容量为初始化容量的一倍
        array=new Object[maxSize+maxSize];
        //将原数组元素，copy到新数组
        for (int i=0;i<=findLastTh(tempArry);i++){
              array[i]=tempArry[i];
            }
        System.out.println("扩容后数组容量:"+array.length);
    }


    //打印表中所有元素
    public void print() {
        int i=0;
        String s="";
        while (i<=findLastTh(array)) {
            s=s+i+":"+array[i]+"\t";
            i++;
        }
        System.out.println(s);
    }
}
