/*
    Andrew Exton - aexton
    Jett Moy - jlmoy
    October 1st, 2018
    ALGORITHMS - Project 1
*/

import java.util.Arrays;

public class SortCounts {
    public static void main(String[] args) {
        for (int size = 100; size <= 12800; size*=2) {
            calculateAverageElementComparisons(size);
        }
    }

    private static void calculateAverageElementComparisons(int size) {
        long[] ssCountResults = new long[100];
        long[] msCountResults = new long[100];
        long[] qsCountResults = new long[100];

        for (int i = 0; i < 100; i++) {
            int[] templateArray = SortUtil.generateRandomArrayOfSize(size);
            int[] array1 = Arrays.copyOf(templateArray, size);
            int[] array2 = Arrays.copyOf(templateArray, size);
            int[] array3 = Arrays.copyOf(templateArray, size);

            long ssCount = Sorts1.selectionSort(array1, size);
            long msCount = Sorts1.mergeSort(array2, size);
            long qsCount = Sorts1.quickSort(array3, size);

            ssCountResults[i] = ssCount;
            msCountResults[i] = msCount;
            qsCountResults[i] = qsCount;
        }

        double ssAvgComp = arrayAverage(ssCountResults);
        double msAvgComp = arrayAverage(msCountResults);
        double qsAvgComp = arrayAverage(qsCountResults);

        System.out.println("N=" + size +
                            ":  C_ss=" + ssAvgComp +
                            ",  C_ms=" + msAvgComp +
                            ",  C_qs=" + qsAvgComp);
    }

    private static double arrayAverage(long[] arr) {
        long total = 0;
        for (int i=0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }

}
