package Interview_M1;

public class TargetSum {
    public static String targetSum(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i; j < arr.length; j++ ){
                if(arr[i]+arr[j] == target){
                    return i + " "+j;
                }
            }
        }

        return null;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5,9};
        System.out.println(targetSum(arr, 6));
    }
}
