// Implement a simple ArrayList

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Red");
        arr.add("Black");
        arr.add("Blue");
        arr.add("Green");

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
