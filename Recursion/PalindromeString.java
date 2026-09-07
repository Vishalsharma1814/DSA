package Recursion;

public class PalindromeString {
    public static boolean isPalindrome(String s, int l, int r) {

        if (s.charAt(l) == s.charAt(r)) {
            if(l>=r){
                return true;
            }
            return isPalindrome(s, l + 1, r - 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar", 0, 6));
    }
}
