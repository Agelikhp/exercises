package model;

public class User {
    String name;
    int age;
    String email;

    // Default constructor
    public User() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "unknown@example.com";
    }

    // Parameterized constructor
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + '}';
    }
}
