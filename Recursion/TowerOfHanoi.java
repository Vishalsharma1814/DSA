package Recursion;

public class TowerOfHanoi {
    public static void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + a + " to rod " + c);
        } else {
            TOH(n - 1, a, c, b);
            System.out.println("Move disk " + n + " from rod " + a + " to rod " + c);
            TOH(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        TOH(3, 'A', 'B', 'C');
    }

}
