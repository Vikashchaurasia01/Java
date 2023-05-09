// Show an example of multiple catch block and nested try.

public class MultCatchNestTry {
    public static void main(String[] args) {
        try {
            int num;
            try {
                System.out.println("Division");
                num = 10 / 0;
                System.out.println(num);
            } 
            catch (ArithmeticException e1) {
                System.out.println(e1);
            }
            try {
                System.out.println("Array Operation");
                int[] arr = new int[10];
                arr[5] = 10;
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println(e2);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Program terminated");
        }
    }
}
