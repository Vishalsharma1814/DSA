package Streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStats {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 87, 3, 4, 8, 6, 7, 11, 32));

        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
                System.out.println(stats);
    }
}
