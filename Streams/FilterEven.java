package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of( 1,2,87,3,4,8,6,7,11,32));
        List<Integer> evenNums = list.stream()
        .filter(n -> n%2 == 0).collect(Collectors.toList());

        System.out.println(evenNums);
    }
}
