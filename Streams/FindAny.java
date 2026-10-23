package Streams;

import java.util.ArrayList;
import java.util.List;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2, 4, 3, 5, 7, 1));
        System.out.println(nums.stream().findAny().get());
    }
}
