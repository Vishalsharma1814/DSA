package Interview_M1;

public class StringReverse {

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i =0; i < sb.length()/2; i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i, temp);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
