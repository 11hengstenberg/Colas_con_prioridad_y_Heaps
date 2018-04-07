package hdt8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alexis Hengstenberg 17699
 * @author Sebastian Arriola 11463
 */
public class CVectorHeapTest {
    
    public CVectorHeapTest() {
    }

    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        pQueue.add(0);
        pQueue.add(1);
        assertEquals(pQueue.getFirst(), new Integer(0));
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        pQueue.add(10);
        pQueue.add(5);
        pQueue.add(0);
        assertEquals(pQueue.remove(), new Integer(0));
    }

    @Test
    public void testAdd() {
        System.out.println("remove");
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        pQueue.add(1);
        assertEquals(pQueue.getFirst(), new Integer(1));
    }

    @Test
    public void testIsEmpty() {
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        assertTrue(pQueue.isEmpty());
    }
    
    @Test
    public void testSize() {
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        pQueue.add(Integer.MIN_VALUE);
        pQueue.add(Integer.MAX_VALUE);
        assertEquals(pQueue.size(), 2);
    }

    @Test
    public void testClear() {
        System.out.println("clear");
        PriorityQueue<Integer> pQueue = new CVectorHeap<>();
        pQueue.add(Integer.MIN_VALUE);
        pQueue.add(Integer.MAX_VALUE);
        pQueue.clear();
        assertEquals(pQueue.size(), 0);
    }
}
