package alexei.anatsky.ITMO_konspect.Collections.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0 && o2 % 2 == 0) || (o1 % 2 != 0 && o2 % 2 != 0)) {
                    return o1.compareTo(o2);
                } else if (o1 % 2 == 0) {
                        return 1;
                    }else {
                        return -1;
                    }
            }
        });

        fillQueue(queue, 5);
        fillQueue(priorityQueue, 5);

        printQueue(queue);
        printEmptyQueue(queue, "Queue");

        printQueue(priorityQueue);
        printEmptyQueue(priorityQueue, "PriorityQueue");

    }

    private static void printQueue(Queue<Integer> queue) {
        System.out.println("*** " + queue.getClass().getSimpleName() + " ***");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static void printEmptyQueue(Queue<Integer> queue, String name) {
        if (queue.isEmpty()) {
            System.out.println(name + " is empty!");
            System.out.println("_________________________________");
        }
    }

    private static void fillQueue(Queue<Integer> e, int bound) {
        while (bound > 0) {
            e.add(bound);
            bound--;
        }
    }
}
