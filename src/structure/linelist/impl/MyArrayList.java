package structure.linelist.impl;

import structure.linelist.MyList;

/**
 * Created by ming on 2017/9/14.
 */
public class MyArrayList <E>implements MyList<E>{

    //集合中数据的长度
    private int size;
    //存储集合的元素
    transient  Object [] elementData;


    /**
     * 获取下标为index的值
     * @param index
     * @return
     */
    public E get(int index) throws Exception {
        checkRange(index);
        return elementDate(index) ;
    }

    /**
     * 插入元素
     * @param index
     * @param element
     */
    public void add(int index, E element) {

    }

    /**
     * 根据下标删除元素
     * @param index
     * @return
     */
    public E remove(int index) throws Exception {
        checkRange(index);
        E oldValue= elementDate(index); //获取旧的数据
        for(int i=index;i<size;i++){
            elementData[index]=elementData[index+1];
        }
        size--;
        return oldValue;
    }



     // 检查下标是否合法
    private void checkRange(int index) throws Exception {
        if(index>size||index<0)
            throw new Exception("数组越界");
    }

    //返回数据
   E elementDate(int index){
       return  (E) elementData[index];
   }

    /**
     * 清空元素
     */
    public void clear() {
        for(int i=0;i<size;i++){
            elementData[i]=null;
        }
        size=0;
    }

    /**
     * 添加元素
     * @param e
     * @return
     */
    public boolean add(E e) {
        return false;
    }

    /**
     * 判断集合是否为空
     */
    public boolean isEmpty() {
        return size>0;
    }

    /**
     * 删除原素
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        return false;
    }

    /**
     * 返回元素集合中数据的长度
     */
    public int size() {
        return size;
    }
}
