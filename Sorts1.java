/*
    Andrew Exton - aexton
    Jett Moy - jlmoy
    October 1st, 2018
    ALGORITHMS - Project 1
*/

public class Sorts1 {

    private static long ssSteps;
    private static long msSteps;
    private static long qsSteps;

    //Sorts the list of N elements contained in arr[0..N-1] using the selection sort algorithm.
	public static long selectionSort(int[] arr, int N) {

        ssSteps = 0;

		// FOR every i starting with first and ending with pre-last position of the list
		for (int i = 0; i < N - 1; i++) {
            ssSteps++;

			int min = arr[i];
			int minIdx = i;

			// Find the minimum value in list[i .. length] and save its index in minIndex
			for (int j = i; j < N; j++) {
                ssSteps++;
				if (arr[j] < arr[minIdx]) {
					min = arr[j];
					minIdx = j;
				}
                ssSteps++;
			}

			// Swap the two elements at minIndex and i positions
			int temp = arr[i];
			arr[i] = min;
			arr[minIdx] = temp;
		}

        return ssSteps;

	}

	//Sorts the list of N elements contained in arr[0..N-1] using the merge sort algorithm.
   public static long mergeSort (int[] list, int N) {
         msSteps = 0;
      mergeSort(list, 0, N-1);
         return msSteps;
   }

   //this method sorts list[first..last] segment
   private static void mergeSort (int[] list, int first, int last) {
      if (first < last) { //checking if there is more than one element in list[first..last] segment
         int middle = (first + last)/2;
         mergeSort(list, first, middle);
         mergeSort(list, middle+1, last);
         mergeSortedHalves (list, first, middle, last); //call a supporting method to merge 2 halves
      }
   }

   //Merges two sorted halves of the array segment arr[left..right]
   private static void mergeSortedHalves (int[] arr, int left, int middle, int right) {
      int count = right - left + 1;
      int[] temp = new int[count];
      int index1 = left ;
      int index2 = middle + 1;
      int index = 0;

      // While there are elements in the list find the smaller of the two elements and add it to the temporary array
      while (index1 <= middle && index2 <= right) {

            msSteps++;

         if (arr[index1] < arr[index2])
            temp[index++] = arr[index1++];
         else
            temp[index++] = arr[index2++];
      }

      // Fill the temporary array with the rest of the unfinished halves
      while (index1 <= middle) {
         temp[index++] = arr[index1++];
      }

      while (index2 <= right) {
         temp[index++] = arr[index2++];
      }

      // Copy temp back to arr
      for (int i = 0; i < count; i++, left++) {
         arr[left] = temp[i];
      }

   }


	//Sorts the list of N elements contained in arr[0..N-1] using the quick sort algorithm with
 	//median-of-three pivot and rearrangement of the three elements
	public static long quickSort(int[] arr, int N) {
       qsSteps = 0;
		quickSort(arr, 0, N-1);
        return qsSteps;
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
			swap(arr, left, center);
		}
        qsSteps++;

		// Compare leftmost and rightmost elements
		// If leftmost is greator than rightmost element, SWAP
		if (arr[left] > arr[right]) {
			swap(arr, left, right);
		}
        qsSteps++;


		// Compare center and rightmost elements
		// If center is less than rightmost element, SWAP
		// Make center greatest and rightmost median of 3 values
		if (arr[center] < arr[right]) {
			swap(arr, center, right);
		}
        qsSteps++;


	}

	private static int splitList(int[] arr, int left, int right) {
		int temp;

		int indexL = left; // first
		int indexR = right - 1; // second from last
		int pivot = arr[right];

		while (indexL < indexR) {
            qsSteps++;

			if (arr[indexL] < pivot) indexL++;
            qsSteps++;

			if (indexR > indexL && arr[indexR] > pivot) indexR--;
            qsSteps++;

            if (indexR > indexL) {
				swap(arr, indexL, indexR);
				indexL++;
				indexR--;
			}
            qsSteps++;

		}
		swap(arr, indexL, right);
		return indexL;
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
