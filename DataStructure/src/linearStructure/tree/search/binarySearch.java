package linearStructure.tree.search;

public class binarySearch {
    private static int[] array;

    public static int search(int[] datas,int target){
        array=datas;
        //指针
        int left;
        int right;
        int mid;

        //指针就位
        mid=(array.length-1)/2;
        left=0;
        right=array.length-1;

        //查找操作
        while (left!=right){
            //目标值在左区间
            if(array[mid]>target){
                //移动尾指针
                right=mid;
                //移动中间指针
                mid=mid/2;
            }
            //目标值在右区间
            else if(array[mid]<target){
                //移动头指针
                left=mid;
                //移动中间指针
                mid=mid+(right-left)/2;
            }

            if(array[mid]==target){
                return mid;
            }
        }

        return -1;

    }
}
