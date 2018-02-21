package 大话数据结构.第4章_栈与队列;

import java.util.Stack;

/**
 * Created by ming on 18-2-9.
 * 栈的链式存储
 */

public class ChainedStorageStack<E> {

    protected int elementCount;
    protected Object[] elementData;
    public ChainedStorageStack() {
    }
    public E push(E item) {
        addElement(item);

        return item;
    }

    /**
     * 添加元素
     * @param item
     */
    private synchronized void addElement(E item) {
        elementData[elementCount++] = item;
    }
}
