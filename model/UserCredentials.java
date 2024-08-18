package model;

public class UserCredentials {
    String username;
    String password;

    // Default constructor
    public UserCredentials() {
        this.username = "defaultUser";
        this.password = "defaultPass";
    }

    // Parameterized constructor
    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}
