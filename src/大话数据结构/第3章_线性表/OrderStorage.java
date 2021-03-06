package 大话数据结构.第3章_线性表;

/**
 * Created by xql on 2018/2/3.
 * 线性表的顺序存储
 */
public class OrderStorage<E> {



    public int size; //线性表长度

    public Object[] elementData; //数组元素

    OrderStorage(){
        elementData=new Object[100]; //初始化
        size=0;
    }

    // 检查下标是否合法
    private void checkRange(int index) throws Exception {
        if(index>size-1||index<0)
            throw new Exception("数组越界");
    }
    //返回长度
    public int  length(){
        return  size;
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
     * 判断集合是否为空
     */
    public boolean isEmpty() {
        return size>0;
    }

    /**
     *
     * @param index 下标
     * @return
     * @throws Exception
     */
    public E getElement(int index) throws Exception {
        return (E)elementData[index] ;
    }

    /**
     * 添加新元素
     * @param index 下标
     * @param element 添加数据
     * @throws Exception
     */
    public void  insertElement(int index,E element) throws Exception {
        checkRange(index);
        for(int i=size-1;i>=index;i--){
            elementData[i+1]=elementData[i];
        }
         elementData[index]=element;
        size++;
    }


    /**
     * 添加新元素
     * @param element 添加数据
     * @throws Exception
     */
    public void  addElement(E element) throws Exception {
        elementData[size]=element;
        size++;
    }


    /**
     * 删除元素
     * @param index 脚标
     * @return
     * @throws Exception
     */
    public E deleteElement(int index) throws Exception {
        checkRange(index);
        Object oldValue=elementData[index];
        for(int i=index;i<size;i++){
            elementData[i]=elementData[i+1];
        }
        size--;
        return (E) oldValue;
    }


    public  static void main(String [] args) throws Exception {
        OrderStorage<Integer> list=new OrderStorage<Integer>();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.deleteElement(2);
        list.insertElement(3,2);
        list.length();
    }

}
