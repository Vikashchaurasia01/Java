// Implement different operations of the Linked list.

import java.util.*;

public class LinkedListOperations {
    public static void main(String args[]) {
        LinkedList<String> my_list = new LinkedList<String>();
        my_list.add("Red");
        my_list.add("Blue");
        my_list.addLast("Cyan");
        my_list.addFirst("Green");
        my_list.add(2, "Yellow");

        System.out.println(my_list);

        my_list.remove("Blue");
        my_list.remove(3);
        my_list.removeFirst();
        my_list.removeLast();

        System.out.println(my_list);
    }
}
