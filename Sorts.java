/*
    Andrew Exton - aexton
    Jett Moy -
    October 1st, 2018
    ALGORITHMS - Project 1
*/

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

   // IF the list contains more than one element
   //  Cut the list into half //This simply means get the midpoint of the list
   //  Mergesort the first half
   //  Mergesort the second half
   //  Merge the two sorted halves into one sorted list

	//Sorts the list of N elements contained in arr[0..N-1] using the merge sort algorithm.
   public static void mergeSort (int[] list, int N) {
       mergeSort(list, 0, N-1);
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
   //Precondition: arr[left..middle] is sorted; arr[(middle+1)..right] is sorted
   //Postcondition: arr[left..right] is sorted.
   private static void mergeSortedHalves (int[] arr, int left, int middle, int right) {
      int[] temp = new int[right - left + 1];
      int index1 = left;
      int index2 = middle + 1;
      int index = left;
      while (index1 < middle && index2 < right) {
         if (arr[index1] < arr[index2])
            temp[index++] = arr[index1++];
         else
            temp[index++] = arr[index2++];
      }

      while (index < index2) {
         arr[index++] = temp[index1++];
      }

            //  Save the smaller of two halves’ indicated elements into the indicated cell of temp

   //  Increment the index of appropriate half (the one that had smaller value)
   //  Increment index of temp to point to the next cell
   //  Copy all remaining elements of the un-finished half into the remaining cells of temp array
   //  Copy all elements from temp array back into arr[left..right]
   // Note: drawback of mergesort is the need to use a temp array (takes extra time to copy back).
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
			swap(arr, left, center);
		}

		// Compare leftmost and rightmost elements
		// If leftmost is greator than rightmost element, SWAP
		if (arr[left] > arr[right]) {
			swap(arr, left, right);
		}

		// Compare center and rightmost elements
		// If center is less than rightmost element, SWAP
		// Make center greatest and rightmost median of 3 values
		if (arr[center] < arr[right]) {
			swap(arr, center, right);
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
				swap(arr, indexL, indexR);
				indexL++;
				indexR--;
			}
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
