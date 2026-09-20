package Basics;
public class LargestElement {
    public static int largerElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length -1; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,8,4,5};
        System.out.println(largerElement(arr));
    }
}
