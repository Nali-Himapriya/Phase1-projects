package AssistedProjects;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue after enqueueing elements: " + queue);
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);

        System.out.println("Queue after dequeuing one element: " + queue);
        int frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        System.out.println("Queue after peeking: " + queue);
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
        int queueSize = queue.size();
        System.out.println("Size of the queue: " + queueSize);
    }
}

