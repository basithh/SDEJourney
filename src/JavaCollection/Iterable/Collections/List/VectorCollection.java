package JavaCollection.Iterable.Collections.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("BAsith");
        strings.add("Such");
        strings.add("Indeuch");
        strings.add("Ioppy");
        System.out.println(strings);
        Iterator<String> iterable = strings.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
