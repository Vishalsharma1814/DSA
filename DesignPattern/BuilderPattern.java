package DesignPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setPhone("1234567890")
                .setAddress("123 Main St")
                .build();
                System.out.println("User created: " + user);
    }
}

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}