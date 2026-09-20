package Basics;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyOfCharacters {

    public static HashMap<Character, Integer> frequencyOfCharacters(String input){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("Hello"));
    }
}
