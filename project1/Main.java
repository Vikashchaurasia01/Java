public class Main {
    public static void main(String[] args) {
        UserDatabase.initialize(); // Initialize user database

        ATM atm = new ATM();
        atm.start();
    }
}
