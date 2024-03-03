package JavaCollection.Iterable.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueColl {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.addFirst("Basith");
        deque.addFirst("Bloant");
        deque.addLast("dd");
        deque.addFirst("Bro");
        System.out.println(deque);
    }
}
