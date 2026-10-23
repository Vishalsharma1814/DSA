package Interview_M1;

import java.util.HashMap;

public class CheckSameFrequency {
    public static boolean checkSameFrequency(String str) {
        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> frequencyCount = new HashMap<>();
        for (char c : charArr) {
            frequencyCount.put(c, frequencyCount.getOrDefault(c, 0) + 1);
        }
        ;
        return frequencyCount.values().stream().distinct().count() > 1 ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(checkSameFrequency("Hello"));
        System.out.println(checkSameFrequency("abc"));
    }
}
