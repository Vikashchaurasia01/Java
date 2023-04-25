package com.vikash;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 1, n;
        System.out.println("Enter the value: ");
        n = in.nextInt();
        in.close();

        for (int count = 2; count <= n; count++) {
            int temp = b;
            b += a;
            a = temp;
            System.out.println(b);
        }

    }
}
