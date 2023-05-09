// // Implement a LinkedList

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> my_list = new LinkedList<String>();
        my_list.add("Green");
        my_list.add("Yellow");
        my_list.add("Orange");
        my_list.add("White");

        Iterator<String> iterator = my_list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
