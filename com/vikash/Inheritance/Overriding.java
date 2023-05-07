//package Inheritance;
//package Lab6;

class Override{
    void display(){
        System.out.println("Override");
    }
}

class Override2 extends Override{
    void display(){
        System.out.println("Override2");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Override o = new Override();
        o.display();

        Override2 O = new Override2();
        O.display();

        Override n = new Override2();
        n.display();
    }
}
