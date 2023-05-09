// Show an example of thread synchronization.


class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name + " is withdrawing " + amount);
    }
}

class Customer extends Thread {
    ATM ob;
    String name;
    int amount;

    public Customer(ATM ob, String name, int amount) {
        this.ob = ob;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        ob.checkBalance(name);
        ob.withdraw(name, amount);
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        ATM ob = new ATM();
        Customer ob1 = new Customer(ob, "abc", 100);
        Customer ob2 = new Customer(ob, "def", 200);
        ob1.start();
        ob2.start();
    }
}
