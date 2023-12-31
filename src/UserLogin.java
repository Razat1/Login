//package LoginSystem;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        System.out.println("Welcome, please log in. You have three attempts");
        //scanner created for user input
        Scanner login = new Scanner(System.in);
        //amount of times to log in limited to three
        int maxAttempts = 3;
        int attempts = 0;
        //two arrays with five names and passwords
        String[] arrName = {"admin", "user2", "user3", "user4", "user5"};
        String[] arrPasswords = {"password", "pass2", "pass3", "pass4", "pass5"};
        //do-while loop started
        do {
            //prompt user to enter username
            System.out.println("Enter your Username:");
            String username = login.nextLine();

            //checks if username is empty and prompts user to try again
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty, try again");
                attempts++;

            } else {
                //prompt user to enter password
                System.out.println("Enter your Password: ");
                String password = login.nextLine();
                //loop initialised to go through arrays to check if user input matches
                boolean loginSuccessful = false;
                for (int i = 0; i < arrName.length; i++) {
                    if (username.equalsIgnoreCase(arrName[i]) && password.equals(arrPasswords[i])) {
                        loginSuccessful = true;
                        break;
                    }
                }
                //messages printed depending on whether login is successful or not
                if (loginSuccessful) {
                    System.out.println("Access granted! Welcome...");
                    break;
                } else {
                    System.out.println("Access denied!");
                    attempts++;
                }
            }
            //shows how many attempts left
            System.out.println("You have " + (maxAttempts - attempts) + " attempt(s) left");
            //loop closed after number of attempts exceed max
        } while (attempts < maxAttempts);

        login.close();
    }
}




