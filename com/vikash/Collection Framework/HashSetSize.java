// Write a Java program to get the number of elements in a hash set

import java.util.*;

public class HashSetSize {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Red");
        hs.add("White");
        hs.add("Pink");
        hs.add("Green");
        hs.add("Black");
        hs.add("Yellow");
        System.out.println("Original Hash Set: " + hs);
        System.out.println("Number of elements in Hash Set: " + hs.size());
    }
}
