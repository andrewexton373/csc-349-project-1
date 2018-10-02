/*
    Andrew Exton - aexton
    Jett Moy - jlmoy
    October 1st, 2018
    ALGORITHMS - Project 1
*/

import java.util.Arrays;

public class SortTimes {
    public static void main(String[] args) {
        for (int size = 5000; size <= 160000; size*=2) {
            for (int i = 1; i <= 5; i++) {
                int[] templateArray = SortUtil.generateRandomArrayOfSize(size);
                runSortsAndPrintStats(templateArray, size);
            }
            System.out.println();
        }
    }

    private static void runSortsAndPrintStats(int[] arr, int size) {
        int[] array1 = Arrays.copyOf(arr, size);
        int[] array2 = Arrays.copyOf(arr, size);
        int[] array3 = Arrays.copyOf(arr, size);

        long start, end, elapsedNS;
        long selectionSortMS, mergeSortMS, quickSortMS;

        start = System.nanoTime();
        Sorts.selectionSort(array1, size);
        end = System.nanoTime();
        elapsedNS = end - start;
        selectionSortMS = elapsedNS / 1000000;

        start = System.nanoTime();
        Sorts.mergeSort(array2, size);
        end = System.nanoTime();
        elapsedNS = end - start;
        mergeSortMS = elapsedNS / 1000000;

        start = System.nanoTime();
        Sorts.quickSort(array3, size);
        end = System.nanoTime();
        elapsedNS = end - start;
        quickSortMS = elapsedNS / 1000000;

        System.out.println("N=" + size +
                            ":  T_ss=" + selectionSortMS +
                            ",  T_ms=" + mergeSortMS +
                            ",  T_qs=" + quickSortMS);
    }

}
