package com.vikash.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList(10);
        // list.add(343);
        // list.add(342);
        // list.add(465);
        // list.add(685);
        // list.add(123);
        // list.add(789);
        // System.out.println(list.contains(76543)); //Boolean Value
        // System.out.println(list);
        // list.set(3,345);
        // list.remove(4);
        // System.out.println(list);
        // list.add(4,678);
        // System.out.println(list);
        // list.trimToSize();
        // System.out.println(list);

        in.close();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // Add Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
