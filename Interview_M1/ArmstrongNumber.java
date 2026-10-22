package Interview_M1;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        for (int i = 0; i < numOfDigits; i++) {
            int n = num % 10;
            sum += Math.pow(n, numOfDigits);
            num = num / 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
