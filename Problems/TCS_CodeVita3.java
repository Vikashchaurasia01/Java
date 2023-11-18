import java.util.Arrays;
import java.util.Scanner;

public class TCS_CodeVita3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] cups = new int[N];

        for (int i = 0; i < N; i++) {
            cups[i] = scanner.nextInt();
        }

        int L = scanner.nextInt();
        scanner.close();

        Arrays.sort(cups);

        int[] counts = new int[N];

        int jugCapacity = L;
        int totalCupsUsed = 0;
        int distinctCupsUsed = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (cups[i] <= jugCapacity) {
                int maxCups = jugCapacity / cups[i];
                int cupsToAdd = Math.min(maxCups, N - distinctCupsUsed);
                counts[i] = cupsToAdd;
                jugCapacity -= cupsToAdd * cups[i];
                totalCupsUsed += counts[i];
                distinctCupsUsed++;
            }
        }

        int[] usedCups = new int[distinctCupsUsed];
        int[] usedCounts = new int[distinctCupsUsed];
        int index = 0;

        for (int i = 0; i < N; i++) {
            if (counts[i] > 0) {
                usedCups[index] = cups[i];
                usedCounts[index] = counts[i];
                index++;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(cups[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < distinctCupsUsed; i++) {
            System.out.print(usedCounts[i] + " ");
        }
    }
}
