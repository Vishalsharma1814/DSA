package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 87, 3, 4, 8, 6, 7, 11, 32));
        list.stream().collect(Collectors.toSet());
    }
}
