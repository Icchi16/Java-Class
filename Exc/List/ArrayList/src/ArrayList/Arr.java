package ArrayList;

import javax.swing.text.html.parser.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Arr {

    public static Integer[] element;
    public final int DEFAULT_CAP = 10;

    static Integer[] MyList() {
        element = new Integer[0];
        return element;
    }

    static Integer[] MyListCapacity(int cap) {
        element = new Integer[cap];
        return element;
    }

    static void add(int index, Integer el) {
        Integer[] tempList = new Integer[element.length + 1];
        for (int i = 0; i < tempList.length; i++) {
            if (i == element.length) {
                tempList[i] = el;
            } else tempList[i] = element[i];
        }
        element = tempList;
    }

    static Integer remove(int index) {
        Integer rmvEl = element[index];
        Integer[] tempList = new Integer[element.length - 1];
        for (int i = 0, k = 0; i < element.length; i++) {
            if (i == index) {
                continue;
            }
            tempList[k++] = element[i];
        }
        element = tempList;

        return rmvEl;
    }

    static int size() {
        return element.length;
    }

    static Integer[] cloneArray() {
        Integer[] cloneArray = element;
        return cloneArray;
    }

    static boolean contains(Integer query){
        for (Integer el: element
             ) {
           return Objects.equals(el, query);
        }
        return false;
    }




    static void ensureCapacity(int minCapacity){
        Integer[] capedArr = new Integer[minCapacity];
        for (int i = 0; i < element.length; i++) {
            capedArr[i] = element[i];
        }
        element = capedArr;
    }

    static boolean checkEmpty() {
        return element.length == 0;
    }
}

