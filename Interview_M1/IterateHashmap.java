package Interview_M1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 80);
        map.put("Mango", 120);
        map.put("Grapes", 60);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
