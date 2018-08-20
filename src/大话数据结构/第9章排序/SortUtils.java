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

    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    /**
     * 冒泡排序
     * @param list
     */
   public static void  bubbleSort(SqList list){
         for (int i=0;i<list.length;i++)
             for(int j=i+1;j<list.length;j++)
                 if(list.r[i]>list.r[j])
                     swap(list,i,j);
    }

    /**
     * 正宗冒泡排序
     * @param list
     */
    public static void  bubbleSortAuthentic(SqList list){
        //两两比较大小，效率高于上一种写法
        boolean flag=true;
        for (int i=0;i<list.length&&flag;i++){
            flag=false;
            for(int j=list.length-1;j>=i;j--)
                if(list.r[j]>list.r[j+1]){
                    swap(list,j,j+1);
                    flag=true;
                }
        }
    }


    //选择排序
    public static void selectSort(SqList list){
        int min;
        for(int i=0;i<list.length;i++){
            min=i;
            for(int j=i+1;j<list.length;j++){
                if(list.r[min]>list.r[j])
                    min=j;
            }
            if(min!=i)
                swap(list,i,min);
        }

    }


    //直接插入排序
    public static void  insertSort(SqList list){
        int j;
        for(int i=1;i<list.length;i++){
           int tmp=list.r[i];
           for(j=i-1;j>=0&&tmp<list.r[j];j--){
               list.r[j+1]=list.r[j];
           }
           list.r[j+1]=tmp;
        }



    }

    public static void main(String[]args){

        int[] ints = QuickSort(new int[]{10, 8, 7, 16, 6, 3, 2, 18, 17, 9});
        System.out.println("111");
    }

    /**
     * 快速排序
     */
    public static int[] QuickSort(int [] arrays){
      return   qsort(arrays,0,arrays.length-1);
    }

    private static int[] qsort(int[] arrays, int low, int higth) {
        int pivot;
        if(low<higth){
            pivot=partition(arrays,low,higth);
            qsort(arrays,low,pivot-1);
            qsort(arrays,pivot+1,higth);
        }
        return arrays;
    }



    //获取枢轴位置
    private static int partition(int[] arrays, int low, int higth) {
        int pivotkey;
        pivotkey = arrays[low];
        while (low < higth) {
            while (low < higth && arrays[higth] >= pivotkey)
                higth--;
            swap(arrays, low, higth);
            while (low < higth && arrays[low] <= pivotkey)
                low++;
            swap(arrays, low, higth);
        }
        return low; //返回枢轴所在位置
    }





}
