package Backtracking;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        permute(arr, 0, n - 1);
    }

    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            printArray(arr);
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); // backtrack
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
