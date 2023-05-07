// package Inheritance;
//package Lab6;

// Write a program to show demonstration of Constructor in Inheritance.

class parent{
    public parent(){
        System.out.println("Constructor called from parent:");
    }
}

class Child extends parent{
    public child(){
        System.out.println("Constructor Called from child:");
    }

}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Constructor Called from GrandChild:");
    }
}

public class InheritConst {
    public static void main(String[] args) {
        GrandChild d = new GrandChild();
    }
}
