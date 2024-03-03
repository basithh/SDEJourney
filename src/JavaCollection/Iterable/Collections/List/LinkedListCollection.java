package JavaCollection.Iterable.Collections.List;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(9);
        integerLinkedList.remove(Integer.valueOf(9));
        System.out.println(integerLinkedList);
    }
}
