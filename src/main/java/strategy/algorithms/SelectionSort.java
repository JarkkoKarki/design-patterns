package strategy.algorithms;

import strategy.SortStrategy;

// https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/
public class SelectionSort implements SortStrategy {
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Merkitään ensimmäinen min arvo
            int min_idx = i;

            // Etsitään pienin arvo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // päivitään min arvo
                    min_idx = j;
                }
            }

            // Siirrretään pienin arvo oikealle paikalleen
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
}
