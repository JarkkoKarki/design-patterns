package iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int count = 0;
    private final int limit;
    private int prev = 0;
    private int current = 1;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }

        int result;
        if (count == 0) {
            result = 1;
        } else if (count == 1) {
            result = 1;
        } else {
            result = prev + current;
            prev = current;
            current = result;
        }
        count++;
        return result;
    }
}

