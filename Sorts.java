public class Sorts {
	//Sorts the list of N elements contained in arr[0..N-1] using the selection sort algorithm.
	public static void selectionSort(int[] arr, int N) {

		// FOR every i starting with first and ending with pre-last position of the list
		for (int i = 0; i < N - 1; i++) {
			int min = Integer.MAX_VALUE;
			int minIdx = 0;

			// Find the minimum value in list[i .. length] and save its index in minIndex
			for (int j = i; j < N; j++) {
				if (arr[j] < arr[minIdx]) {
					min = arr[j];
					minIdx = j;
				}
			}

			// Swap the two elements at minIndex and i positions
			int temp = arr[i];
			arr[i] = min;
			arr[minIdx] = temp;
		}

	}

	//Sorts the list of N elements contained in arr[0..N-1] using the merge sort algorithm.
	public static void mergeSort(int[] arr, int N) {

	}
	
	//Sorts the list of N elements contained in arr[0..N-1] using the quick sort algorithm with
 	//median-of-three pivot and rearrangement of the three elements
	public static void quickSort(int[] int N) {

	}
}
