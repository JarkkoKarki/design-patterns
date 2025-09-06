package strategy;

import strategy.algorithms.BubbleSort;
import strategy.algorithms.QuickSort;
import strategy.algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {
         SortContext sortContext = new SortContext(new BubbleSort());

         int[] array = createArray(50);
         int[] array1 = createArray(100000);

         int[] copy = array.clone();
         int[] copy1 = array.clone();
         int[] copy2 = array.clone();

         int[] copy3 = array1.clone();
         int[] copy4 = array1.clone();
         int[] copy5 = array1.clone();

         // __________Bubble Sort___________

         sortContext.setStrategy(new BubbleSort());
         System.out.println("Bubble sort:");
         for (int i : copy) {
             System.out.print(i + " ");
         }
         double startTime = System.nanoTime();
         sortContext.sort(copy);
         double endTime = System.nanoTime();
         System.out.println("\n___________________________________");
         for (int i : copy) {
             System.out.print(i + " ");
         }
         System.out.println("\n\nTime: " + (endTime - startTime) / 1_000_000 + " ms");

         // __________Selection Sort___________

         sortContext.setStrategy(new SelectionSort());
            System.out.println("\nSelection sort:");
            for (int i : copy1) {
                System.out.print(i + " ");
            }
            startTime = System.nanoTime();
            sortContext.sort(copy1);
            endTime = System.nanoTime();
            System.out.println("\n___________________________________");
            for (int i : copy1) {
                System.out.print(i + " ");
            }
            System.out.println("\n\nTime: " + (endTime - startTime) / 1_000_000 + " ms");


            // __________Quick Sort___________

            sortContext.setStrategy(new QuickSort());
            System.out.println("\nQuick sort:");
            for (int i : copy2) {
                System.out.print(i + " ");
            }
            startTime = System.nanoTime();
            sortContext.sort(copy2);
            endTime = System.nanoTime();
            System.out.println("\n___________________________________");
            for (int i : copy2) {
                System.out.print(i + " ");
            }
            System.out.println("\n\nTime: " + (endTime - startTime) / 1_000_000 + " ms\n______________________________________");


            // __________Bubble Sort 100000___________

            sortContext.setStrategy(new BubbleSort());
            System.out.println("\nBubble sort 100000:");
            startTime = System.nanoTime();
            sortContext.sort(copy3);
            endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // __________Selection Sort 100000___________

            sortContext.setStrategy(new SelectionSort());
            System.out.println("\nSelection sort 100000:");
            startTime = System.nanoTime();
            sortContext.sort(copy4);
            endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // __________Quick Sort 100000___________

            sortContext.setStrategy(new QuickSort());
            System.out.println("\nQuick sort 100000:");
            startTime = System.nanoTime();
            sortContext.sort(copy5);
            endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) / 1_000_000 + " ms");






    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
