package Basics;
import java.util.*;

public class CountVowels {
    public static Map<String, Integer> countVowels(String input){
        HashMap<String, Integer> map = new HashMap<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            for (char vowel : vowels) {
                if (ch == vowel) {
                    map.put(String.valueOf(vowel), map.getOrDefault(String.valueOf(vowel), 0) + 1);
                    break;
                }
            }
        }

        return map;

    }
    static void main(String[] args) {

    }
}
