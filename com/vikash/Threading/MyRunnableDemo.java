// Write a program to create a thread by Implementing and Runnable Interface.

class MyRunnable implements Runnable {
    public void run() {
        int i;
        for (i = 1; i <= 5; i++)
            System.out.println("Hello " + i);
    }
}

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread th = new Thread(mr);
        int i;
        th.start();
        for (i = 1; i <= 5; i++)
            System.out.println("World " + i);
    }
}
