package Basics;

public class WordReverse {
    public static String reverseWord(String input){
        String[] arr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i != 0){
                sb.append(arr[i] + " ");
            }else{
                sb.append(arr[i]);
            }

        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {

        System.out.println(reverseWord("Hello World"));
    }
}
