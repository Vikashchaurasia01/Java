// package Inheritance;
// package Lab6;

// In a single program show method overriding and method overloading.
// Overriding is the process of changing the behaviour of a method
// in a class that is already defined in another class.

class Overriding{
    public void show(){
        System.out.println("Overriding from show");
    }
}

class Overloading extends Overriding{
    Overloading(){
        System.out.println("Method Overloading");
    }
    Overloading(int x, int y){
        System.out.println("Overloading value "+"x="+x+" y="+y);
    }
    public void show(){
        System.out.println("Overloading from show");
    }

}

public class OverloadAndOverride {
    public static void main(String[] args) {
        // // Overriding
        // Overriding O = new Overriding();
        // O.show();
        // // Overloading
        Overloading O1 = new Overloading();
        Overloading O2 = new Overloading(45,66);
        O1.show();

        Overriding n = new Overloading();
        n.show();

    }
}
