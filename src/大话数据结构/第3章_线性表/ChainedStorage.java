package 大话数据结构.第3章_线性表;

/**
 * Created by xql on 2018/2/5.
 */
public class ChainedStorage {


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
