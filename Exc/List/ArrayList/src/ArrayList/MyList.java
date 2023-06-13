package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCap() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void ensureCap(int index) {
        elements = Arrays.copyOf(elements, index + 1);
    }

    public void add(int index, E element) {
        if (index >= elements.length) {
            ensureCap(index);
        }
        elements[index] = element;
        System.out.println(Arrays.toString(elements));
    }

    public E remove(int index) {
        E removedElement;
        if (index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        } else {
            removedElement = (E) elements[index];
            elements[index] = null;
        }
        System.out.println("Removed: " + removedElement.toString());
        return removedElement;
    }

    public int size(){
        return elements.length;
    }

    public E clone(){
        return null;
    }

    public boolean contains(E object){
        for (E element: elements
             )
            return element == object;
        return false;
    }

    public int indexOf(E object){
        for ()
    }





    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size);
        }
        return (E) elements[i];
    }


}
