package Interview_M1;

import java.util.TreeMap;

public class NumberOfWords {
    
    public static TreeMap<String, Integer> countWords(String str){
    TreeMap<String, Integer> result = new TreeMap<>();
        String[] words = str.split(" ");
        for(String word: words){
            result.put(word.toLowerCase(), result.getOrDefault(word.toLowerCase(), 0) +1 );
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello World Hello Everyone Hello world with people";
       System.out.println(countWords(str));

    }
}
