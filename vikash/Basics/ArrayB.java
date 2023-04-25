package com.vikash.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayB {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                /*
                 * int[] ros = new int[5];
                 * System.out.println(ros[0]); // Output is 0
                 * 
                 * // String
                 * String[] arr = new String[4];
                 * System.out.println(arr[0]); // Output is Null
                 * 
                 * // Null value can't be initialised in Primitive data types i.e, int a = Null
                 * // But it can be initialised in Non-Primitive dta types i.e, String str =
                 * Null
                 * String str = null;
                 * System.out.println(str);
                 * // int a = null; can't be initialised
                 * 
                 */

                // Inputs using for loop:
                int[] arr = new int[5];
                System.out.println("Enter the elements of the array");
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = in.nextInt();
                }
                System.out.println(Arrays.toString(arr)); // perfect way to print the elements of array
                // for (int i = 0; i < arr.length; i++){
                // System.out.print(arr[i] + " ");
                // }
                // System.out.println(arr[5]); //Index out of bound error
                // Or
                // Enhanced for loop:
                // for(int num : arr) //For every element in array
                // {
                // System.out.print(num + " "); //Here num represents the element of the array
                // }
                in.close();

        }
}
