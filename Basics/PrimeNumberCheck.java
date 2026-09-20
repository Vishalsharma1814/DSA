package Basics;

public class PrimeNumberCheck {
    public static boolean checkPrime(int num){
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        for (int i = 3; i < num; i++) {
            if( num%i == 0){
                return  false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPrime(7));
        System.out.println(checkPrime(10));
        System.out.println(checkPrime(2));
    }
}
