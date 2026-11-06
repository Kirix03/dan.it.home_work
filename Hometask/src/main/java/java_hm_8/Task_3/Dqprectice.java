package java_hm_8.Task_3;
import java.util.Deque;
import java.util.LinkedList;

public class Dqprectice {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        System.out.println("Add Kyryll to the beginning");
        deque.addFirst("Kyryll");

        System.out.println("Add Nikita to the end");
        deque.addLast("Nikita");

        System.out.println("Add Maks to the beginning");
        deque.offerFirst("Maks");

        System.out.println("Add Lexa to the end");
        deque.offerLast("Lexa");

        System.out.println("Current Deque");
        System.out.println(deque);

        System.out.println("Get first element");
        System.out.println(deque.getFirst());

        System.out.println("Get last element");
        System.out.println(deque.getLast());

        System.out.println("Peek first element");
        System.out.println(deque.peekFirst());

        System.out.println("Peek last element");
        System.out.println(deque.peekLast());

        System.out.println("Remove first element");
        System.out.println(deque.removeFirst());

        System.out.println("Remove last element");
        System.out.println(deque.removeLast());

        System.out.println("Deque after remove");
        System.out.println(deque);

        System.out.println("Add new element");
        deque.add("Anton");

        System.out.println(deque);

        System.out.println("Checking is Nikita is in deque");
        System.out.println(deque.contains("Nikita"));

        System.out.println("Delete first and last element");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println("Size Deque");
        System.out.println(deque.size());

        System.out.println("Checking deque is empty");
        System.out.println(deque.isEmpty());

        System.out.println("Add element with steck");
        deque.push("First");
        deque.push("Second");

        System.out.println(deque);

        System.out.println("Clear Deque");
        deque.clear();

        System.out.println(deque);

    }
}
