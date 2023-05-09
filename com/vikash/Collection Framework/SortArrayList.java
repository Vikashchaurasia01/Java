// Write a Java program to sort a given ArrayList.

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(3);
        arr.add(9);
        arr.add(-33);
        System.out.println("Before Sorting ArrayList: " + arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println("After sorting ArrayList: " + arr);
    }
}
