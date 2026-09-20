package Basics;

public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first){
                first = arr[i];
            }
            if(arr[i] < first && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5};
        System.out.println(secondLargest(arr));
    }
}
