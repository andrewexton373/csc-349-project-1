public class Sorts {
	//Sorts the list of N elements contained in arr[0..N-1] using the selection sort algorithm.
	public static void selectionSort(int[] arr, int N) {

		// FOR every i starting with first and ending with pre-last position of the list
		for (int i = 0; i < N - 1; i++) {
			int min = arr[i];
			int minIdx = i;

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
	public static void quickSort(int[] arr, int N) {
		quickSort(arr, 0, N-1);
	}

	private static void quickSort(int[] arr, int first, int last) {		
		if (first < last) { // check there's more than one element in the list
			setPivotToEnd(arr, first, last);
			int pivotIndex = splitList(arr, first, last);
			quickSort(arr, first, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, last);
		}
	}

	private static void setPivotToEnd(int[] arr, int left, int right) {
		int temp;
		int center = right - left;

		// Compare leftmost and center elements
		// If leftmost is greator than center element, SWAP
		if (arr[left] > arr[center]) {
			temp = arr[left];
			arr[left] = arr[center];
			arr[center] = temp;
		}

		// Compare leftmost and rightmost elements
		// If leftmost is greator than rightmost element, SWAP
		if (arr[left] > arr[right]) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}

		// Compare center and rightmost elements
		// If center is less than rightmost element, SWAP
		// Make center greatest and rightmost median of 3 values
		if (arr[center] < arr[right]) {
			temp = arr[center];
			arr[center] = arr[right];
			arr[right] = temp;
		}

	}

	private static int splitList(int[] arr, int left, int right) {
		int temp;

		int indexL = left; // first
		int indexR = right - 1; // second from last
		int pivot = arr[right];

		while (indexL < indexR) {
			if (arr[indexL] < pivot) indexL++;
			if (indexR > indexL && arr[indexR] > pivot) indexR--;
			if (indexR > indexL) {
				temp = arr[indexL];
				arr[indexL++] = arr[indexR];
				arr[indexR--] = temp;
			}
		}

		temp = arr[indexL];
		arr[indexL] = arr[right];
		arr[right] = temp;

		return indexL;
	}
}
