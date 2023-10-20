package javacanos.atm_machine.oop;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static final int MAX_USERS = 10;
    private static String[][] userCredentials = new String[10][2];
    private static double[] userBalances = new double[10];
    private static int userCount = 0;

    private static void userLogIn(Scanner scanner) {
        System.out.println("\nUser Login:");

        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        for (int i = 0; i < userCount; i++) {
            if (userCredentials[i][0].equals(username) && userCredentials[i][1].equals(password)) {
                System.out.println("Login successful!");
                mainProgram(username);
                return;
            }
        }

        System.out.println("Login failed. Please check your username and password.");
    }

    private static void mainProgram(String username) {
        do {
            System.out.println("\nMAIN MENU");
            System.out.println("Please select an option:");
            System.out.println("1. Deposit Amount.");
            System.out.println("2. Withdraw Amount.");
            System.out.println("3. Check Balance.");
            System.out.println("4. Transfer Amount.");
            System.out.println("5. Log out.");
            int mainOption = scanner.nextInt();

            switch (mainOption) {
                case 1:
                    depositAmount(username);
                    break;
                case 2:
                    withdrawAmount(username);
                    break;
                case 3:
                    checkBalance(username);
                    break;
                case 4:
                    transferAmount(username);
                    break;
                case 5:
                    System.out.println("Logged out. Thank you!");
                    return;
                default:
                    System.out.println("ERROR: Invalid option.");
            }
        } while (true);
    }

    private static void userRegister(Scanner scanner) {
        System.out.println("User Registration:");

        if (userCount < MAX_USERS) {
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();

            if (isUsernameTaken(username)) {
                System.out.println("Username already exists. Please choose another one.");
            } else {
                userCredentials[userCount][0] = username;
                userCredentials[userCount][1] = password;
                userBalances[userCount] = 0.0;
                userCount++;
                System.out.println("Registration successful.");
            }
        } else {
            System.out.println("ERROR: Maximum number of users reached.");
        }
    }

    private static boolean isUsernameTaken(String username) {
        for (int i = 0; i < userCount; i++) {
            if (userCredentials[i][0].equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void depositAmount(String username) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            int userIndex = getUserIndex(username);
            if (userIndex <= MAX_USERS) {
                userBalances[userIndex] += amount;
                System.out.println("Deposit successful. New balance: P" + userBalances[userIndex]);
            } else {
                System.out.println("ERROR: User not found.");
            }
        } else {
            System.out.println("ERROR: Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdrawAmount(String username) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            int userIndex = getUserIndex(username);
            if (userIndex <= MAX_USERS) {
                if (userBalances[userIndex] >= amount) {
                    userBalances[userIndex] -= amount;
                    System.out.println("Withdrawal successful. New balance: P" + userBalances[userIndex]);
                } else {
                    System.out.println("ERROR: Insufficient balance.");
                }
            } else {
                System.out.println("ERROR: User not found.");
            }
        } else {
            System.out.println("ERROR: Invalid amount. Please enter a positive value.");
        }
    }

    private static void checkBalance(String username) {
        int userIndex = getUserIndex(username);
        if (userIndex <= MAX_USERS) {
            System.out.println("Your account balance: P" + userBalances[userIndex]);
        } else {
            System.out.println("ERROR: User not found.");
        }
    }

    private static void transferAmount(String senderUsername) {
        System.out.print("Enter the username of the recipient: ");
        String recipientUsername = scanner.next();
        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            int senderIndex = getUserIndex(senderUsername);
            int receiverIndex = getUserIndex(recipientUsername);

            if (senderIndex <= MAX_USERS && receiverIndex <= MAX_USERS) {
                if (userBalances[senderIndex] >= amount) {
                    userBalances[senderIndex] -= amount;
                    userBalances[receiverIndex] += amount;
                    System.out.println("Transfer successful.");
                } else {
                    System.out.println("ERROR: Insufficient balance.");
                }
            } else {
                System.out.println("ERROR: Sender or recipient not found.");
            }
        } else {
            System.out.println("ERROR: Invalid amount. Please enter a positive value.");
        }
    }

    private static int getUserIndex(String username) {
        for (int i = 0; i < userCount; i++) {
            if (userCredentials[i][0].equals(username)) {
                return i;
            }
        }
        return 0; 
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Javacano's ATM Machine");

        do {
            System.out.println("Choose an option:");
            System.out.println("1) Register");
            System.out.println("2) Log in");
            System.out.println("3) Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    userRegister(scanner);
                    break;
                case 2:
                    userLogIn(scanner);
                    break;
                case 3:
                    System.out.println("The program will exit. Thank you!");
                    return;
                default:
                    System.out.println("ERROR: Invalid choice.");
            }
        } while (true);
    }
}
