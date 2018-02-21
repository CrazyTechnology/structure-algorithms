package 大话数据结构.第4章_栈与队列;

import java.util.EmptyStackException;

/**
 * Created by ming on 18-2-9.
 * 栈的链式存储
 */

public class ChainedStorageStack<E> {

    protected int elementCount;
    protected Object[] elementData;
    public ChainedStorageStack() {
    }

    /**
     * 添加元素
     * @param item
     * @return
     */
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


    /**
     * @return
     */
    public synchronized E pop() {
        E       obj;
        int     len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }


    /**
     * 返回棧頂元素
     * @return
     */
    public synchronized E peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }


    /**
     * 返回棧的長度
     * @return
     */
    public synchronized int size() {
        return elementCount;
    }


    public synchronized E elementAt(int index) {
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
        }

        return elementData(index);
    }

    /**
     * 根據下標返回元素
     * @param index
     * @return
     */
    E elementData(int index) {
        return (E) elementData[index];
    }


    /**
     * 刪除元素
     * @param index
     */
    public synchronized void removeElementAt(int index) {
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    elementCount);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int j = elementCount - index - 1;
        if (j > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, j);
        }
        elementCount--;
        elementData[elementCount] = null; /* to let gc do its work */
    }
}
