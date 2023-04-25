package com.vikash;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = in.nextInt();
        float area = (float) (3.14 * radius * radius);
        System.out.println("Area = " + area);
        in.close();
    }
}
