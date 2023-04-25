package com.vikash;

import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of radius & height: ");
        int radius = in.nextInt();
        int height = in.nextInt();
        float area = (float) (2 * 3.14 * radius * height);
        System.out.println("area = " + area);
        in.close();
    }
}
