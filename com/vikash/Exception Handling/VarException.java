// Show different types of exception .

public class VarException {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Division");
                int num = 10 / 0;
                System.out.println(num);
            } catch (ArithmeticException e1) {
                System.out.println(e1);
            }
            try {
                System.out.println("\nArray Operation");
                int[] arr = new int[5];
                arr[5] = 10;
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println(e2);
            }
            try {
                System.out.println("\nInteger Operation");
                int num = Integer.parseInt("hello");
                System.out.println(num);
            } catch (NumberFormatException e3) {
                System.out.println(e3);
            }
            try {
                System.out.println("\nString Operation");
                String str = "hello";
                System.out.println(str.charAt(6));
            }
            catch (StringIndexOutOfBoundsException e4) {
                System.out.println(e4);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("\nProgram terminated");
        }
    }
}
