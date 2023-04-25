package com.vikash.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Enter the strings of array: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));
        in.close();
    }

    // Strings are immutable in java
    // Arrays are mutable in java
}