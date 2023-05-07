public class ComplexNumber {
    private int x;
    private int y;
    public ComplexNumber(int x, int y){
        this.x  = x;
        this.y = y;
    }
    public void show() {
        System.out.println(x + " i" + y);
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.x = c1.x + c2.x;
        res.y = c1.y + c2.y;
        return res;
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5,6);
        ComplexNumber c2 = new ComplexNumber(7,8);
        System.out.print("first Complex number = ");
        c1.show();
        System.out.print("\nsecond Complex number = ");
        c2.show();
        ComplexNumber res = add(c1,c2);
        System.out.print("\nsum = ");
        res.show();
    }
   // private static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {

}

