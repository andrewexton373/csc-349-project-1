import java.util.Arrays;

public class TestSorts {

    public static void main(String[] args) {
        testSorts1();
    }

    public static void testSorts1() {
        int[] testArr1 = {1,3,2};

        int[] sortedArr = {1,2,3};

        System.out.println("TEST 1:");
        System.out.print("SELECTION SORT: ");
        Sorts.selectionSort(testArr1, 3);
        printIntArray(testArr1);
        if (Arrays.equals(sortedArr, testArr1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    public static void printIntArray(int[] arr) {
        System.out.print("ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }

}