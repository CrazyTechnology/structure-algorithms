package 大话数据结构.第9章排序;


import java.lang.reflect.Array;

public class SortUtils {

    /**
     * 快速排序
     */
    public static void QuickSort(int [] arrays){
        qsort(arrays,1,arrays.length);
    }

    private static void qsort(int[] arrays, int low, int higth) {
        int pivot;
        if(low<higth){
            pivot=partition(arrays,low,higth);
            qsort(arrays,low,pivot-1);
            qsort(arrays,pivot+1,higth);
        }
    }



    //获取枢轴位置
    private static int partition(int[] arrays, int low, int higth) {
        int pivotkey;
        pivotkey=arrays[low];
        while (low<higth){
            while (low<higth&&arrays[higth]>=pivotkey)
                higth--;
            swap(arrays,low,higth);
            while (low<higth&&arrays[low]<=pivotkey)
                low++;
            swap(arrays,low,higth);
        }
        return low; //返回枢轴所在位置

    }

    //交换位置
    private static void swap(int[] arrays, int low, int higth) {
    }

}
