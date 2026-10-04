package Interview_M1;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Iteratehashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Iterate using entrySet()
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> itr = iterator.next();
            System.out.println(itr.getKey() + " : " + itr.getValue());
            iterator.remove();
        }

    }
}
