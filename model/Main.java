package model;

public class Main {
    public static void main(String[] args) {
        // Create an instance of User using the parameterized constructor
        User user = new User("Angeliki", 31, "papa@gmail.com");

        // Create an instance of UserCredentials using the parameterized constructor
        UserCredentials userCredentials = new UserCredentials("angelikiUser", "angelikiPass");

        // Print out the fields of both instances
        System.out.println(user);
        System.out.println(userCredentials);
    }
}

