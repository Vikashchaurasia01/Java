// Using the Collections.sort() method, sort the ArrayList.

import java.util.*;

public class SortArrayListC {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Orange");
        arr.add("Mango");
        arr.add("Apple");
        arr.add("Watermelon");
        arr.add("Banana");

        System.out.println("Before sorting arr: " + arr);
        Collections.sort(arr);
        System.out.println("After sorting arr : " + arr);
    }
}
