import java.util.Scanner;

public class ATM {
    private User currentUser;
    private TransactionHistory transactionHistory;

    public ATM() {
        transactionHistory = new TransactionHistory();
    }

    public void start() {
        boolean loggedIn = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (!loggedIn) {
            System.out.print("Enter user ID: ");
            String userId = scanner.nextLine();

            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            User user = UserDatabase.getUser(userId);

            if (user != null && user.checkPin(pin)) {
                currentUser = user;
                loggedIn = true;
                System.out.println("Login successful!\n");
            } else {
                System.out.println("Invalid user ID or PIN. Please try again.\n");
            }
        }


        boolean exit = false;

        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("1. View transaction history");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewTransactionHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void viewTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction transaction : transactionHistory.getTransactions(currentUser.getUserId())) {
            System.out.println(transaction);
        }
        System.out.println();
    }

    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (currentUser.getBalance() >= amount) {
            currentUser.withdraw(amount);
            transactionHistory.addTransaction(new Transaction(currentUser.getUserId(), "Withdraw", amount));
            System.out.println("Withdrawal successful!\n");
        } else {
            System.out.println("Insufficient funds. Please try again.\n");
        }
        scanner.close();
    }

    private void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        currentUser.deposit(amount);
        transactionHistory.addTransaction(new Transaction(currentUser.getUserId(), "Deposit", amount));
        System.out.println("Deposit successful!\n");
        scanner.close();
    }

    private void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter recipient's user ID: ");
        String recipientUserId = scanner.nextLine();

        User recipient = UserDatabase.getUser(recipientUserId);

        if (recipient != null) {
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            if (currentUser.getBalance() >= amount) {
                currentUser.withdraw(amount);
                recipient.deposit(amount);
                transactionHistory.addTransaction(new Transaction(currentUser.getUserId(), "Transfer to " + recipient.getUserId(), amount));
                System.out.println("Transfer successful!\n");
            } else {
                System.out.println("Insufficient funds. Please try again.\n");
            }
        } else {
            System.out.println("Recipient not found. Please try again.\n");
        }
        scanner.close();
    }
}
