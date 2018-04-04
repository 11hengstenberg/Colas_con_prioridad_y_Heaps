/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.util.Vector;

/**
 *
 * @author sebdeveloper6952
 */
public class CVectorHeap<E extends Comparable<E>> implements
        PriorityQueue<E>
{
    protected Vector<E> vector;
    
    public CVectorHeap()
    {
        vector = new Vector<>();
    }
    
    public CVectorHeap(int initialCapacity)
    {
        vector = new Vector<>(initialCapacity);
    }
    
    public CVectorHeap(int initialCapacity, int capacityIncrement)
    {
        vector = new Vector<>(initialCapacity, capacityIncrement);
    }
    
    @Override
    public E getFirst() 
    {
        if(vector.isEmpty()) return null;
        return vector.get(0);
    }

    @Override
    public E remove() 
    {
        if(vector.isEmpty()) return null;
        E temp = vector.get(0);
        swap(0, vector.size()-1);
        vector.remove(vector.size()-1);
        pushValueDown(0);
        return temp;
    }

    @Override
    public void add(E value) 
    {
        vector.add(vector.size(), value);
        pushValueUp(vector.size()-1);
    }

    @Override
    public boolean isEmpty() 
    {
        return vector.isEmpty();
    }

    @Override
    public int size() 
    {
        return vector.size();
    }

    @Override
    public void clear()
    {
        vector.clear();
    }
    
    protected void pushValueDown(int index)
    {
        while(index < vector.size())
        {
            // find smallest child
            int left = index*2+1;
            int smallest = -1;
            // node has 2 children, choose smallest
            if((left+1) < vector.size())
            {
                // left is smallest
                if(vector.get(left).compareTo(vector.get(left+1)) <= 0)
                    smallest = left;
                // right is smallest
                else smallest = (left+1);
            }
            // node has left child, choose left child
            else if(left < vector.size()) smallest = left;
            else break; // node has no children
            if(smallest > 0)
            {
                if(vector.get(index).compareTo(vector.get(smallest)) >  0)
                {
                    swap(index, smallest);
                    index = smallest;
                }
                else break; // already in heap order
            }
        }
    }
    
    protected void pushValueUp(int index)
    {
        int parentIndex;
        while(index > 0)
        {
            parentIndex = (index-1)/2;
            if(vector.get(parentIndex).compareTo(vector.get(index)) > 0)
            {
                swap(parentIndex, index);
                index = parentIndex;
            } else break;
        }
    }
    
    protected void swap(int index0, int index1)
    {
        if(index0 < 0 || index0 >= vector.size() || index1 < 0 ||
                index1 >= vector.size()) return;
        E temp = vector.get(index0);
        vector.set(index0, vector.get(index1));
        vector.set(index1, temp);
    }
}
