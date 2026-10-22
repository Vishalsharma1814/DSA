package Interview_M1;

public class SecondHighest {
    public static int secondHighest(int[] arr) {
        int highest = arr[0];
        int secondHighest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];

            }
            if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 17, 28, 51, 56 };

        System.out.println(secondHighest(arr));
    }
}
