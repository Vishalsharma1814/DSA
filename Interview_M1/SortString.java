package Interview_M1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        String str = "Banana Apple Grapes Orange Watermelon";

       List<String> stringArr = new ArrayList<>(List.of(str.split(" "))); 
        Collections.sort(stringArr);
        StringBuilder sortedString = new StringBuilder();
        for (String string : stringArr) {
            sortedString.append(string+" ");
        }
        System.out.println(sortedString);

        // Other way to do it
        String[] stringArr2 = str.split(" ");
        Arrays.sort(stringArr2);
        String resultString = String.join(" ", sortedString);

        System.out.println(resultString);

    }
}
