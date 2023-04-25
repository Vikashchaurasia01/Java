
import java.util.Scanner;

public class funcSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();

        int ans = sum(x, y);
        System.out.println("sum = " + ans);
    }

    static int sum(int x, int y) {
        return x + y;
    }
}
