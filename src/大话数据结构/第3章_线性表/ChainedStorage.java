package 大话数据结构.第3章_线性表;

import java.lang.annotation.ElementType;

/**
 * Created by xql on 2018/2/5.
 */
public class ChainedStorage <E>{

    //长度
    public int size;
    //头结点
    transient Node<E> first;
    //尾结点
    transient Node<E> last;

    public int size() {
        return size;
    }
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    /**
     * 根据下标获取数据
     * @param index
     * @return
     */
    public  E  getElement(int index){
        checkPositionIndex(index);
        if(index<(size>>1)){
            Node <E> node=first;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node.item;
        }else{
            Node <E> node=last;
            for(int i=size-1;i>index;i++){
                node=node.prev;
            }
            return node.item;
        }

    }


    /**
     * 把元素加到头结点
     * @param element
     */
    public  void  addFirst(E element){
        Node oldFirst=first;
        Node newFirst=new Node(null,element,oldFirst);
        if(oldFirst==null)
            last=newFirst;
        else
            oldFirst.prev=newFirst;
        size++;
    }


    /**
     * 把元素加到尾结点
     * @param element
     */
    public  void  addLast(E element){
        Node oldLast=last;
        Node newLast=new Node(last,element,null);
        if(oldLast==null)
            last=newLast;
        else
            oldLast.next=newLast;
        size++;
    }


    /**
     * 添加元素
     * @param element
     */
    public void add(E element) {
        addLast(element);
    }


    /**
     * 插入元素
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        checkPositionIndex(index);

    }

















    /**
     * 定义一个节点
     * @param <E>
     */
    private static class Node<E>{
            E item;
            Node<E> next;
            Node<E> prev;
            Node(Node<E> prev, E element, Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }
}
