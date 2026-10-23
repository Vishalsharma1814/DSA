package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5));
        System.out.println(nestedNumbers.stream().flatMap(n -> n.stream()).collect(Collectors.toList())
    );
    }
}
