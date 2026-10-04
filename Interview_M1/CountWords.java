package Interview_M1;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over a lazy lazy dog";

        String[] arr = str.split(" ");
        HashMap<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(counts);
    }
}
