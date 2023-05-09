// Implement a simple Vector.

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.addElement("Blue");
        v.addElement("Grey");
        v.addElement("Cyan");
        v.addElement("Pink");

        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
