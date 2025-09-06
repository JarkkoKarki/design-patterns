package strategy;

public class SortContext {

    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array) {
        return sortStrategy.sort(array);
    }
}
