package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNames {
    public static void main(String[] args) {
        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
                "Charlie Lou");
        System.out.println(fullNames.stream().map(e -> e.split(" ")[0]).collect(Collectors.toList()));
    }
}
