/*
    Andrew Exton - aexton
    Jett Moy - jlmoy
    October 1st, 2018
    ALGORITHMS - Project 1
*/

import java.util.Random;

public class SortUtil {
    public static int[] generateRandomArrayOfSize(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomNumberInRange(0, 100);
        }
        return array;
    }

    public static int generateRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
