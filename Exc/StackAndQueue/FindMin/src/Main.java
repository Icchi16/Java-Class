import sun.awt.image.IntegerInterleavedRaster;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Integer[] integersArr = {89, 23, 44, 55, 67, 32, 7, 8, 17, 6};

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(integersArr));

        System.out.println(queueMin(queue));
        System.out.println(queue);
    }

    public static Integer queueMin(Queue<Integer> queue) {
        while (true) {
            Queue<Integer> tempQueue = new LinkedList<>(queue);
            Integer firstValue = tempQueue.poll();
            boolean isNotMin = false;

            for (Integer secondValue : tempQueue
            ) {
                if (firstValue > secondValue) {
                    queue.remove();
                    queue.add(firstValue);
                    isNotMin = true;
                    break;
                }
            }
            if (!isNotMin) {
                return queue.peek();
            }
        }
    }
}