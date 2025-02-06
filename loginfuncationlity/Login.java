package loginfuncationlity;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "user";
        String correctPassword = "pass";
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Attempt " + attempt + ":");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = maskPassword(scanner);

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        if (!loggedIn) {
            System.out.println("Login failed. You have used all your attempts.");
        }

        scanner.close();
    }

    private static String maskPassword(Scanner scanner) {
        StringBuilder password = new StringBuilder();
        while (true) {
            char ch = scanner.nextLine().charAt(0);
            if (ch == '\n') {
                break;
            }
            password.append(ch);
            System.out.print("*");
        }
        System.out.println();
        return password.toString();
    }
}
