package Interview_M1;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicates {
    public static void main(String[] args) {
        String str = "Hello";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            hashMap.put(charArray[i], hashMap.getOrDefault(charArray[i], 0)+1);
        }

        for (Map.Entry<Character, Integer> itr: hashMap.entrySet()) {
            if(itr.getValue() > 1){
                System.out.println(itr.getKey()+": "+ itr.getValue());
            }
        }
    }
    
}