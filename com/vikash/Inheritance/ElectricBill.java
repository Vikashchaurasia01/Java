// package Inheritance;
//package Lab6;

import java.util.Scanner;

// Write a program to calculate electricity bill for domestic and commercial users.
// Enter number of units consumed.

class domestic{
    int units,bill;

    void getData(int units){
        this.units = units;
    }
    void domestic_bill(){
        if(units > 500){
            bill = units*10;
            this.bill=bill;
        }
        else{
            bill = units*15;
            this.bill=bill;
        }
    }
    public int display(){
        return bill;
    }       
}
class commercial extends domestic{
    void Commercial_bill(){
        //domestic(int units);
        bill = bill + (units*5);
    }
    public int display(){
        return bill;
    }
}

class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed:");
        int units = sc.nextInt();
        domestic d = new domestic();
        d.getData(units);
        d.domestic_bill();
        System.out.println("Domestic bill = "+d.display());
        
        commercial c = new commercial();
        c.Commercial_bill();
        c.getData(units);
        System.out.println("Commercial bill = "+c.display());

        // domestic d1 = new commercial();
        // d1.display();

        sc.close();
    }
}
