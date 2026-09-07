package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStrings {
    static List<String> strList = new ArrayList<>();

    static List<String> printAllSubsets(String s) {
        printAllSubsetsHelper(s, 0, "");
        Collections.sort(strList);
        return strList;
    }

    static void printAllSubsetsHelper(String s, int i, String cur) {
        if (i == s.length()) {
            if (cur.length() > 0) {
                strList.add(cur);
            }
            return;
        }
        printAllSubsetsHelper(s, i + 1, cur + s.charAt(i));
        printAllSubsetsHelper(s, i + 1, cur);
    }

    public static void main(String[] args) {
        System.out.println(printAllSubsets("abc"));

    }
}
