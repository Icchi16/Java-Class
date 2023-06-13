package module;


public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    //      Method Add new ????
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printData(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        if (index != 0) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        } else {
            head = head.next;
        }
        numNodes--;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        return this;
    }

    public boolean contains(Object object) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == object || temp.data == object) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object object){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if(temp.data == object){
                return i;
            }
            temp = temp.next;
        }
        throw new ArrayIndexOutOfBoundsException("Not found!");
    }
}
