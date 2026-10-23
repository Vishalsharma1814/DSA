package Streams;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 87, 3, 4, 8, 6, 7, 11, 32));
        list.stream().sorted().forEach(System.out::println);
    }
}
