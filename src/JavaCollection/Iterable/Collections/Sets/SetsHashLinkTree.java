package JavaCollection.Iterable.Collections.Sets;

import java.util.*;

public class SetsHashLinkTree {
    public static void main(String[] args) {
        //Hashset no order
        Set<String> stringsHash = new HashSet<>();
        stringsHash.add("Bas");
        stringsHash.add("Zee");
        stringsHash.add("Zee");
        stringsHash.add("Zee");
        stringsHash.add("Pobs");

        System.out.println(stringsHash);
        //LinkedList
        Set<String> stringsLink = new LinkedHashSet<>();
        stringsLink.add("Bas");
        stringsLink.add("LOPO");
        stringsLink.add("pksd");
        System.out.println(stringsLink);

        //Treeset
        TreeSet<String> stringsTree = new TreeSet<String>();
        stringsTree.add("seerg");
        stringsTree.add("pksd");
        stringsTree.add("bas");
        stringsTree.add("asd");
        System.out.println(stringsTree);
//        Iterator a = stringsTree.iterator();
//        while (a.hasNext()){
//            System.out.println(a.next());
//        }

    }
}
