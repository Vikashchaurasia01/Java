class hello{
    private int x,y;
    public void getdata(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void print(){
        System.out.println("x="+x+" and "+"y="+y);
    }
}

public class this1 {
    public static void main(String[] args) {
        hello h = new hello();
        h.getdata(50,60);
        h.print();
    }
}
