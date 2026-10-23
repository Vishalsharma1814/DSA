package Streams;

import java.util.Arrays;
import java.util.List;

public class uppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
