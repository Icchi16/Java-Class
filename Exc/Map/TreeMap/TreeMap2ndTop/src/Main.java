import java.util.Comparator;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[] numArr = {1, 3, 4, 5, 6, 3, 23, 52, 106};
        TreeMap<Integer, Integer> myTreeMap = new TreeMap<>(Comparator.naturalOrder());
        for (Integer value : numArr
        ) {
            myTreeMap.put(value, 0);
        }
        TreeMap<Integer,Integer> tempMap = myTreeMap;
        tempMap.remove(myTreeMap.lastKey());
        System.out.println("2nd highest value is: " + tempMap.lastKey());
    }
}