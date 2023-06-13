package ArrayList;

public class ArrayLIstTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(0,1);
        listInteger.add(1,2);
        listInteger.add(2,3);
        listInteger.add(3,4);
        listInteger.add(4,5);

        listInteger.remove(3);
        listInteger.contains(2);

        }
}
