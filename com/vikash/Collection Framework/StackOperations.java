// Implement PUSH POP operation in Stack.

import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("Apple");
        s.push("Orange");
        s.push("Mango");
        System.out.println("Stack: " + s);
        String item = s.pop();
        System.out.println("Item popped =  " + item);
        System.out.println("Stack after pop: " + s);
    }
}
