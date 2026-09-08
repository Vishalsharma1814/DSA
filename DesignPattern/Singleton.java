package DesignPattern;

public class Singleton{
     // Single instance
    private static Singleton instance;

    // Private constructor prevents creating objects from outside
    private Singleton() {
    }

    // Global access point
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}