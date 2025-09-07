package strategy.algorithms;

import strategy.SortStrategy;

// https://www.geeksforgeeks.org/dsa/quick-sort-algorithm/
public class QuickSort implements SortStrategy {
    @Override
    public int[] sort(int[] arr) {
        int num = arr.length;
        int high = num - 1;
        int low = 0;
        // choose the pivot
        quickSort(arr, low, high);
        return arr;
    }


    static int partition(int[] arr, int low, int high) {

        // viimeinen elementti pivot
        int pivot = arr[high];

        // indeksi pienemminnän elementin vasemmalle puolelle
        int i = low - 1;


        // käydään elementit läpi ja jos elementti on pienempi kuin pivot vaihdetaan paikat
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // vaihdetaan pivot oikealle paikalleen
        //pivotin toinen puoli on suurempi ja toinen pienempi kuin pivot
        swap(arr, i + 1, high);
        return i + 1;
    }

    // swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // the QuickSort function implementation
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // palautetaan pivot
            int pi = partition(arr, low, high);


            // Järjestetään pivotin vasen ja oikea puoli
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}
