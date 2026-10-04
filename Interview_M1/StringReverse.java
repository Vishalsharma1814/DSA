package Interview_M1;

// Write a Java Program to reverse a string without using String inbuilt function.
public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello, World!";

        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            str = str.substring(0,i) + str.charAt(j) + str.substring(i+1,j) + str.charAt(i) + str.substring(j+1);
            i++;
            j--;

        }
        System.out.println(str);
    }
}
