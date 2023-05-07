// package Lab7;

// Write a program to calculate volume of a sphere and cone using interface ‘Shape’.

interface Shape{
    final double pi = 3.141;
    public abstract double volume();
}

class Sphere implements Shape{
    double r;
    Sphere(double radius){
        this.r = radius;
    }
    public double volume(){
        return (4/3)*pi*r*r*r;
    }
}

class Cone implements Shape{
    double r,h;
    Cone(double radius,double height){
        this.r = radius;
        this.h = height;
    }
    public double volume(){
        return pi*r*r*h/3;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Shape s = new Sphere(5.0);
        // s.getData(5.0);
        System.out.println("Vol. of sphere "+s.volume());

        Shape c = new Cone(5.0, 6.0);
        // c.getData(5.0, 6.0);
        System.out.println("Vol. of cone "+c.volume());

    }
}
