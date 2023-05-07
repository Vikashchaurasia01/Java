// package Inheritance;
//package Lab6;

class demo{

   demo(int x){
        System.out.println("hello from super class demo with param constructor "+x);
    }
}

class Newdemo extends demo{

    Newdemo(int x, int y){
        super(x);
        System.out.println("hello from super class demo with 2-param constructor "+x+" "+y);
    }
}

public class superKey {
    public static void main(String[] args) {
        Newdemo d = new Newdemo(10,20);
    }
}
