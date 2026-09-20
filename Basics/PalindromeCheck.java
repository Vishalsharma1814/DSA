package Basics;

public class PalindromeCheck {

    public static boolean isPalindrome(String input){
        char[] inputArray = input.toLowerCase().toCharArray();
        for(int i=0, j= inputArray.length-1; i<j; i++, j--){
            if(inputArray[i] != inputArray[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
    }
}
