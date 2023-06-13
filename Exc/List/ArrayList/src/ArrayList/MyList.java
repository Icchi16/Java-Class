package ArrayList;

import java.util.Arrays;

public class MyList<E> {
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
        System.out.println(Arrays.toString(elements));
        return removedElement;
    }

    public int size() {
        return elements.length;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E object) {
        for (Object element : elements
        )
            if ((E) element == object) {
                System.out.println("List contain " + object + " at index: " + indexOf(object));
                return true;
            }
        ;
        System.out.println("List not contain " + object);
        return false;
    }

    public int indexOf(E object) {
        for (int i = 0; i < elements.length; i++) {
            if (object == (E) elements[i]) {
                return i;
            }
        }
        return -1;
    }


    public void ensureCapacity(int minCap) {
        elements = Arrays.copyOf(elements, minCap);

    }

    public E get(int index) {
        if (index >= elements.length || index < -1) {
            return (E) elements[index];
        }
        throw new IndexOutOfBoundsException("Index out of bound | Index: " + index + " Size: " + elements.length);
    }

    public void clear() {
        elements = new Object[elements.length];
    }
}

