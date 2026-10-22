package Interview_M1;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");

        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        Iterator<String> lisIterator = list.iterator();\ 

        while (lisIterator.hasNext()) {
            System.out.println(lisIterator.next());
        }

        for (String str : list) {
            System.out.println(str);
        }
    }
}
