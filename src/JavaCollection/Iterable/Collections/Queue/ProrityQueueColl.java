package JavaCollection.Iterable.Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProrityQueueColl {



    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new YC());

        queue.add("Seen");
        queue.add("Bah");
        queue.add("Fee");

        System.out.println(queue.comparator());;
        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.print(" "+queue.poll());
        }
    }

}
class YC implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
