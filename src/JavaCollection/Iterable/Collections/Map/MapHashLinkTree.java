package JavaCollection.Iterable.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapHashLinkTree {
    public static void main(String[] args) {
        System.out.println("Hashmap");

        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("basith","good");
        stringStringMap.put("asith","good");
        stringStringMap.put("sith","good");
        stringStringMap.put("ith","good");
        System.out.println(stringStringMap);

        System.out.println("LinkedMap");
        Map<String,String> stringStringMap1 = new LinkedHashMap<>();
        stringStringMap1.put("basith","good");
        stringStringMap1.put("asith","good");
        stringStringMap1.put("sith","good");
        stringStringMap1.put("ith","good");
        System.out.println(stringStringMap1);

        System.out.println("Tree Map");
        Map<String,String> stringStringMap2 = new TreeMap<>();
        stringStringMap2.put("basith","good");
        stringStringMap2.put("asith","good");
        stringStringMap2.put("sith","good");
        stringStringMap2.put("ith","good");
        System.out.println(stringStringMap2);


    }
}
