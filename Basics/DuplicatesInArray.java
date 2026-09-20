package Basics;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesInArray {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
               res.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,8,4,5,1,2,8,4,5};
        System.out.println(removeDuplicates(arr));
    }
}
