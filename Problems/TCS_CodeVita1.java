import java.util.Scanner;

public class TCS_CodeVita1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        long q = findSmallestNumber(numbers);
        long p = findSmallestPrime(q, numbers);

        if (p == -1) {
            System.out.println("None");
        } else {
            System.out.println(p);
        }
        scanner.close();
    }

    private static long findSmallestNumber(long[] numbers) {
        long smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    private static long findSmallestPrime(long q, long[] numbers) {
        long p = q + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != q && p % numbers[i] != q) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime == true) {
                return p;
            }
            p++;
        }
    }
}
