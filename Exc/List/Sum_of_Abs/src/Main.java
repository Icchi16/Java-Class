import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);

        int result = sum(numList);
        System.out.println(result);
    }

    public static int sum(List<Integer> numList) {
        final int[] result = {0};
        numList.forEach(num -> {
            result[0] += num;
        });
        return result[0];
    }

}
