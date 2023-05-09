// Write a Java program to search an element in an ArrayList.

import java.util.*;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println("List: " + arr);

        int element = arr.get(2);
        System.out.println("Element at index 2 is " + element);
    }
}
