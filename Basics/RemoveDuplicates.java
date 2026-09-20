package Basics;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static Set<Integer> removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for (int i : arr){
            res.add(i);
        }
        return  res;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,8,4,5,1,2,8,4,5};
        System.out.println(removeDuplicates(arr));
    }
}
