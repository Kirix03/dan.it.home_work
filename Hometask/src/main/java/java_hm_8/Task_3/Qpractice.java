package java_hm_8.Task_3;
import java.util.Queue;
import java.util.LinkedList;

public class Qpractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Add element in Queue:");
        queue.add("Kyryll");
        queue.add("Maks");
        queue.add("Nikita");

        System.out.println(queue);

        System.out.println("Number of elements in the queue");
        System.out.println(queue.size());

        System.out.println("First element in queue");
        System.out.println(queue.element());

        System.out.println("Delete first in queue");
        System.out.println(queue.remove());
        System.out.println("Queue after remove: " + queue);

        System.out.println("Delete first element");
        System.out.println(queue.poll());

        System.out.println("Queue after poll: " + queue);

        System.out.println("Checking if Nikita is in the queue");
        System.out.println(queue.contains("Nikita"));

        System.out.println("Check if the queue is empty");
        System.out.println(queue.isEmpty());

        System.out.println("Clear Queue");
        queue.clear();

        System.out.println(queue);

        System.out.println("Queue is clear:" + queue.isEmpty());
    }
}
