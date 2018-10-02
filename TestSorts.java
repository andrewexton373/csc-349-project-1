import java.util.Arrays;

public class TestSorts {

    public static void main(String[] args) {
        testSorts1();
        testSorts2();
        testSorts3();
    }

    public static void testSorts1() {
        System.out.println("TEST 1:");
        int[] sortedArr = {1,2,3};

        int[] testArr1 = {1,3,2};
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 3);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));

        int[] testArr2 = {1,3,2};
        System.out.print("QUICK SORT: ");
        Sorts.selectionSort(testArr2, 3);
        printIntArray(testArr2);
        printPassOrFail(Arrays.equals(sortedArr, testArr2));
        int[] testArr3 = {1,3,2};
        System.out.print("MERGE SORT: ");
        Sorts.mergeSort(testArr3, 3);
        printIntArray(testArr3);
        printPassOrFail(Arrays.equals(sortedArr, testArr3));

        System.out.println("-----------\n");
    }

    public static void testSorts2() {
        System.out.println("TEST 2:");
        int[] sortedArr = {1,2,3};

        int[] testArr1 = {3,2,1};
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 3);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));

        int[] testArr2 = {3,2,1};
        System.out.print("QUICK SORT: ");
        Sorts.selectionSort(testArr2, 3);
        printIntArray(testArr2);
        printPassOrFail(Arrays.equals(sortedArr, testArr2));

        int[] testArr3 = {3,2,1};
        System.out.print("MERGE SORT: ");
        Sorts.mergeSort(testArr3, 3);
        printIntArray(testArr3);
        printPassOrFail(Arrays.equals(sortedArr, testArr3));

        System.out.println("-----------\n");
    }

    public static void testSorts3() {
        System.out.println("TEST 3:");
        int[] sortedArr = {1,2,3,6,10,11};

        int[] testArr1 = {10,3,2,6,11,1};
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 6);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));

        int[] testArr2 = {10,3,2,6,11,1};
        System.out.print("QUICK SORT: ");
        Sorts.selectionSort(testArr2, 6);
        printIntArray(testArr2);
        printPassOrFail(Arrays.equals(sortedArr, testArr2));

        int[] testArr3 = {10,3,2,6,11,1};
        System.out.print("MERGE SORT: ");
        Sorts.mergeSort(testArr3, 6);
        printIntArray(testArr3);
        printPassOrFail(Arrays.equals(sortedArr, testArr3));

        System.out.println("-----------\n");
    }

    public static void printIntArray(int[] arr) {
        System.out.print("ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }

    public static void printPassOrFail(boolean passed) {
        if (passed) { System.out.println("PASS");
        } else { System.out.println("FAIL"); }
    }

}
