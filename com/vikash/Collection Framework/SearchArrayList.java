// Write a Java program to search an element in an ArrayList.

import java.util.*;

public class SearchArrayList {
    public static void main(String[] args) {
        List<String> my_list = new ArrayList<String>();
        my_list.add("Red");
        my_list.add("Green");
        my_list.add("Orange");
        my_list.add("White");
        my_list.add("Black");
        if (my_list.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
