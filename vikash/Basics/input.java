package com.vikash.Basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the integer value");
            System.out.println(input.nextInt());
            System.out.println(input.nextLine());
            System.out.println("Enter the float value");
            System.out.println(input.nextFloat());
            System.out.println("Enter the double value");
            System.out.println(input.nextDouble());
            System.out.println("Enter the  string");
            System.out.println(input.nextShort());
            System.out.println("Enter the boolean value");
            System.out.println(input.nextBoolean());
            System.out.println("Enter the long integer value");
            System.out.println(input.nextLong());
        }
    }
}