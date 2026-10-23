package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 87, 2, 4, 8, 6, 4, 87, 32));
        System.out.println(list.stream().collect(Collectors.toSet()));
        System.out.println(list.stream().distinct().sorted().collect(Collectors.toList()));
    }
}
