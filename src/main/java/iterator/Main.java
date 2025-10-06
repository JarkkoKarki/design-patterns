package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int limit = 10;
        Sequence sequence = new FibonacciSequence(limit);

        System.out.println("First " + limit + " Fibonacci numbers:");
        Iterator<Integer> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

