package 大话数据结构.第9章排序;


import java.lang.reflect.Array;

public class SortUtils {

    private static final int  MAXSIZE=10;

     static class SqList{
        int[] r=new int[MAXSIZE+1];
        int length;
    }

    //交换位置
    private static void swap(SqList list, int i, int j) {
         int temp = list.r[i];
        list.r[i]=list.r[j];
        list.r[j]=temp;
    }


    /**
     * 冒泡排序
     * @param list
     */
   public static void  bubbleSort(SqList list){
         for (int i=0;i<list.length;i++)
             for(int j=i+1;j<=list.length;j++)
                 if(list.r[i]>list.r[j])
                     swap(list,i,j);
    }

    /**
     * 正宗冒泡排序
     * @param list
     */
    public static void  bubbleSortAuthentic(SqList list){
        //两两比较大小，效率高于上一种写法
        for (int i=0;i<list.length;i++)
            for(int j=list.length-1;j>=i;j--)
                if(list.r[j]>list.r[j+1])
                    swap(list,j,j+1);
    }



    public static void main(String[]args){
        SqList list=new SqList();
        list.r=new int[]{1,3,5,7,8,6,4,12,50,37,23,18,13,11,45,20,23,90,189};
        list.length=list.r.length-1;
        long start=System.currentTimeMillis();
        bubbleSortAuthentic(list);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 快速排序
     */
//    public static void QuickSort(int [] arrays){
//        qsort(arrays,1,arrays.length);
//    }

//    private static void qsort(int[] arrays, int low, int higth) {
//        int pivot;
//        if(low<higth){
//            pivot=partition(arrays,low,higth);
//            qsort(arrays,low,pivot-1);
//            qsort(arrays,pivot+1,higth);
//        }
//    }



//    //获取枢轴位置
//    private static int partition(int[] arrays, int low, int higth) {
//        int pivotkey;
//        pivotkey=arrays[low];
//        while (low<higth){
//            while (low<higth&&arrays[higth]>=pivotkey)
//                higth--;
//            swap(arrays,low,higth);
//            while (low<higth&&arrays[low]<=pivotkey)
//                low++;
//            swap(arrays,low,higth);
//        }
//        return low; //返回枢轴所在位置
//
//    }






}
