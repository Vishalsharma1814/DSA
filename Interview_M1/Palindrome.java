package Interview_M1;

public class Palindrome {
    public static boolean isPalindromeString(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeNumber(int num) {
        if (num < 0) {
            return false;
        }

        StringBuilder str = new StringBuilder();
        while (num > 0) {
            str.append(num % 10);
            num = num / 10;
        }
        
        return isPalindromeString(str.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeString("Hello"));
        System.out.println(isPalindromeString("level"));

        System.out.println(isPalindromeNumber(10));
        System.out.println(isPalindromeNumber(101));

    }
}
