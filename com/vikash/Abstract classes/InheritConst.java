package Lab6;

// Write a program to show demonstration of Constructor in Inheritance.

class demo{

    public int x;

    public demo(int x){
        this.x = x;
    }
    public int display(){
        return x;
    }

}
class demo1 extends demo{
    public int y;

    public demo1(int y){
        super(y);
        this.y = y;
    }
    public int display(){
        return (x+y);
    }
}

public class InheritConst {
    public static void main(String[] args) {
        demo d = new demo(10);
        d.display();

        demo1 d1 = new demo1(20);
        System.out.println("sub class "+d1.display());
    }
}
