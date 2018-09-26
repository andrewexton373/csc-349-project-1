import java.util.Arrays;

public class TestSorts {

    public static void main(String[] args) {
        testSorts1();
        testSorts2();
        testSorts3();
    }

    public static void testSorts1() {
        int[] testArr1 = {1,3,2};
        int[] sortedArr = {1,2,3};

        System.out.println("TEST 1:");
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 3);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));
    }

    public static void testSorts2() {
        int[] testArr1 = {3,2,1};
        int[] sortedArr = {1,2,3};

        System.out.println("TEST 2:");
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 3);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));
    }

    public static void testSorts3() {
        int[] testArr1 = {10,3,2,6,11,1};
        int[] sortedArr = {1,2,3,6,10,11};

        System.out.println("TEST 3:");
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 6);
        printIntArray(testArr1);
        printPassOrFail(Arrays.equals(sortedArr, testArr1));
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