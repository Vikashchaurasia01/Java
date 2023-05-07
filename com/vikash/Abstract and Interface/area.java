// package Lab7;

// WAP to find the area of a rectangle, square and triangle using abstract class.

abstract class area1{
    abstract public void rectangle(int len, int bre);
    abstract public void square(int side);
    abstract public void triangle(int base, int height);
}

class demo extends area1{
    public void rectangle(int len, int bre){
        System.out.println("Area of Rectangle is : " + (len*bre));
    }
    public void square(int side){
        System.out.println("Area of Square is : " + (side*side));
    }
    public void triangle(int base, int height){
        System.out.println("Area of Triangle is : " + (base*height/2));
    }
}

public class area{
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println();
        d.rectangle(20,10);
        System.out.println();
        d.square(5);
        System.out.println();
        d.triangle(6,4);
    }
}