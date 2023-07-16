import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "Duy");
        myHashMap.put(2, "Ku");
        myHashMap.put(3, "Nhân");
        myHashMap.put(4, "Thị");
        myHashMap.put(null, "Mumei");

        HashMap<Integer, String> myClonedMap = new HashMap<>(myHashMap);
        System.out.println(myHashMap.equals(myClonedMap));
    }
}