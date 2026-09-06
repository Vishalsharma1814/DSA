package Recursion;

public class JosephusProblem {
    public static int josephus(int n, int k){
        if (n == 1) {
            return 0;
        }
        return (josephus(n-1, k) + k) % n;
    }
    public static void main(String[] args) {
        // this solution is for 0 based indexing
       System.out.println(josephus(6, 4));
    }
}
