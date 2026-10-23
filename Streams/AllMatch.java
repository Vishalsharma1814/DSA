package Streams;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-1, 2, 87, 3, 4, 8, 6, 7, 11, 32));
        System.out.println(list.stream().allMatch(n -> n > 0));
    }
}
