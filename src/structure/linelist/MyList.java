package structure.linelist;

/**
 * Created by ming on 2017/9/14.
 */
public interface MyList<E> {
    E get(int index) throws Exception;
    void add(int index, E element);
    E remove(int index) throws Exception;
    void clear();
    boolean add(E e);
    boolean isEmpty();
    boolean remove(Object o);
    int size();

}
