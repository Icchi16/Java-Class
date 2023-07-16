
import java.util.Comparator;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> myTreeMap = new TreeMap<>(Comparator.reverseOrder());

        myTreeMap.put(1,1);
        myTreeMap.put(2,4);
        myTreeMap.put(3,6);
        myTreeMap.put(4,3);
        myTreeMap.put(5,9);

        System.out.println(myTreeMap.entrySet());
        }

    public static class reverseOrder implements Comparator<Integer> {

        @Override
        public int compare(Integer value1, Integer value2) {
            return value2.compareTo(value1) * -1;
        }
    }
}