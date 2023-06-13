package module;

import java.util.LinkedList;
import module.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(14);


        System.out.println();
        linkedList.printList();
        System.out.println("-------");
        System.out.println(linkedList.indexOf(10));
    }
}
