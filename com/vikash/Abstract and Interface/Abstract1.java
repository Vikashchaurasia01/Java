//package Lab7;
// Find the square, square root and cube of number. Use abstract class.

abstract class demo1 {
    abstract public void Square(int x);
    abstract public void SquareRoot(int x);
    abstract public void Cube(int x);
}

class demo extends demo1{
    public void Square(int x) {
        System.out.println("square of "+x+" is "+x*x);
    }
    public void SquareRoot(int x) {
        System.out.println("square root of "+x+" is "+Math.sqrt(x));
    }
    public void Cube(int x) {
        System.out.println("cube of "+x+" is "+x*x*x);
    }    
}

public class Abstract1{
    public static void main(String[] args) {
        demo d = new demo();
        d.Square(5);
        d.SquareRoot(25);
        d.Cube(5);
    }
}