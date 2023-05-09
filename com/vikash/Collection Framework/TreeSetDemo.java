// Write a Java program to add all the elements of a specified tree set to another tree set.



import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Red");
        ts.add("Green");
        ts.add("Orange");
        System.out.println("Tree set1: " + ts);

        TreeSet<String> ts2 = new TreeSet<String>();
        ts2.add("Pink");
        ts2.add("White");
        ts2.add("Black");
        System.out.println("Tree set2: " + ts2);

        ts.addAll(ts2);
        System.out.println("Tree set1: " + ts);
    }
}
