// Implement a Priority queue using Interface.

import java.util.*;

class MyComparator implements Comparator<Integer> {
    public int compare(Integer num1, Integer num2) {
        int value = num1.compareTo(num2);
        return value;
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        System.out.println("PriorityQueue: " + pq);
        pq.remove(1);
        System.out.println("PriorityQueue: " + pq);
    }
}