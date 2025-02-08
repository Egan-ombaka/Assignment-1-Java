/*
 * @AUTHOR : Egan Ombaka
 * REG NO : BSE-01-0076/2024
 * Assignment 1 Object Oriented Programming 2
 */
import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        // Predefined username and password
        final String USERNAME = "eganh";
        final String PASSWORD = "password123";

        Console console = System.console();
        if (console == null) {
            System.out.println("No console available. Please run in a terminal.");
            return;
        }

        int attempts = 3; // Maximum login attempts

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            String enteredUsername = console.readLine(); // Read the username input from the console

            char[] passwordArray = console.readPassword("Enter Password: "); // Read the password input from the console
            String enteredPassword = new String(passwordArray); // Convert char array to a string

            // Check credentials
            if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
                System.out.println("Login Successful! Welcome, " + USERNAME); 
                return;
            } else {
                attempts--;
                System.out.println("Invalid username or password. Attempts left: " + attempts);
            }

            //failed login message
            if (attempts == 0) {
                System.out.println("Account locked. Too many failed attempts."); 
            }
        }
    }
}
