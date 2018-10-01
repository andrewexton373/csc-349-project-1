import java.util.Random;
import java.util.Arrays;

public class SortTimes {
    public static void main(String[] args) {
        int arraySize = 160000
        int[] templateArray = generateRandomArrayOfSize(arraySize);
        int[] array1 = Arrays.copyOf(templateArray, arraySize);
        int[] array2 = Arrays.copyOf(templateArray, arraySize);
        int[] array3 = Arrays.copyOf(templateArray, arraySize);


    }

    private static int[] generateRandomArrayOfSize(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomNumberInRange(0, 100);
        }
        return array;
    }

    private static int generateRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}