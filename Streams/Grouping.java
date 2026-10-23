package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Rahul", 25),
                new User("Priya", 30),
                new User("Amit", 25),
                new User("Neha", 28),
                new User("Vikas", 30),
                new User("Sneha", 25),
                new User("Karan", 28));
        Map<Integer, List<User>> userByAge = users.stream()
                .collect(Collectors.groupingBy(n -> n.getAge()));
        System.out.println(userByAge);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}