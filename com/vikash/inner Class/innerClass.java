public class inner1{
    int x = 10;
    class inner2{
        int y = 20;
        void print(){
            System.out.println(x+y);
        }
    }
    inner2 o = new inner2();
    o.print();

    void display(){
        System.out.println(x);
        //System.out.println(y); // Here y will give error because it's declared in inner class
    }
}

public class innerClass {
    public static void main(String[] args) {
        
        inner1 i = new inner1();
        i.display();

        // inner1.inner2 u = new inner1().new inner2();
        // u.print();
    }
    
}
