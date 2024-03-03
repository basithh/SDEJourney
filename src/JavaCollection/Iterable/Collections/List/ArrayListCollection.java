package JavaCollection.Iterable.Collections.List;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        //add
        strings.add("Basith");
        strings.add("Looper");
        strings.add("Basith");

        System.out.println(strings);
        //
        strings.get(0);

        strings.remove("Basith");
    }
}
