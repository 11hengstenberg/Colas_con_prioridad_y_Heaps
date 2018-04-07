package hdt8;

/**
 * @author Alexis Hengstenberg 17699
 * @author Sebastian Arriola 11463
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    public E getFirst();
    public E remove();
    public void add(E value);
    public boolean isEmpty();
    public int size();
    public void clear();
}
