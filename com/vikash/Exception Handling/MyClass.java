public class MyClass {
    public static void main(String[] args) {
        int n = 0;
        int num;
        try {
            num = 10 / n;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured");
            System.out.println(e);
        } finally {
            System.out.println("Program terminated");
        }
    }

    public void display() {
    }
}
