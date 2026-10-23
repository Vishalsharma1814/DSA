package Interview_M1;

public class RemoveNumFromArray {

    public static int removeNumInstances(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return arr.length - count;
    }

    public static void main(String[] args) {
        System.out.println(removeNumInstances(new int[] {1,2,1,4,5,1}, 1));
    }
}
