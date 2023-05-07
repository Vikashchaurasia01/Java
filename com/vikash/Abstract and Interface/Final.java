// package Lab7;

abstract class hello{

    void hii(){
        System.out.println("hii from parent class ");
    }
    public abstract void abs();
}

class FinalKey extends hello{
    final int x = 10;   // can't change the value of x;
    public FinalKey(){
        System.out.println("value of x from sub class is "+x);
    }
    public void abs(){
        System.out.println("hello from abstract method");
    }
}

public class Final {
    public static void main(String[] args) {
        FinalKey F = new FinalKey();
        //F.x = 40;   // Error , can't change the value of final variable
        F.abs();
    }
}
