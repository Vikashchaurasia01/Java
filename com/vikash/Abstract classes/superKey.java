package Lab6;

class demo{

    public void display(){
        System.out.println("hello from super class demo");
    }

    public void display(int x){
        System.out.println("hello from super class demo with param constructor "+x);
    }
}

class Newdemo extends demo{

    public void display(){
        System.out.println("hello from sub class demo");
    }

    public void display(int x, int y){
        System.out.println("hello from super class demo with 2-param constructor "+y);
    }
}

public class superKey {
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
        d.display(10);

        Newdemo nd = new Newdemo();
        nd.display();
        nd.display(20,30);
    }
}
