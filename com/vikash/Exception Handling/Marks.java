// Write a program to calculate percentage of a student for 3 different subjects. 
// Create an exception if the marks entered greater than 100.

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = 0, sub2 = 0, sub3 = 0;
        double avg = 0.0;
        try {
            System.out.print("Enter marks of 1st subject: ");
            sub1 = sc.nextInt();
            System.out.print("Enter marks of 2nd subject: ");
            sub2 = sc.nextInt();
            System.out.print("Enter marks of 3rd subject: ");
            sub3 = sc.nextInt();
            sc.close();
            if (sub1 > 100 || sub2 > 100 || sub3 > 100)
                throw new MyException("Marks greater than 100");
            avg = (sub1 + sub2 + sub3) / 3.0;
        } 
        catch (MyException e) {
            System.out.println("Exception occured");
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Percentage = " + avg);
        }
        
    }
}
