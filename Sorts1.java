public class Sorts1 {
	//Sorts the list of N elements contained in arr[0..N-1] using the selection sort algorithm.
	public static long selectionSort(int[] arr, int N) {
      int comparisons = 0;

		// FOR every i starting with first and ending with pre-last position of the list
		for (int i = 0; i < N - 1; i++) {
			int min = arr[i];
			int minIdx = i;

			// Find the minimum value in list[i .. length] and save its index in minIndex
			for (int j = i; j < N; j++) {
            comparisons++;
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

      return comparisons;

	}

   // IF the list contains more than one element
   //  Cut the list into half //This simply means get the midpoint of the list
   //  Mergesort the first half
   //  Mergesort the second half
   //  Merge the two sorted halves into one sorted list

   //Sorts the list of N elements contained in arr[0..N-1] using the merge sort algorithm.
   public static long mergeSort (int[] list, int N) {
       return mergeSort(list, 0, N-1);

   }

   //this method sorts list[first..last] segment
   private static long mergeSort (int[] list, int first, int last) {
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
   private static long mergeSortedHalves (int[] arr, int left, int middle, int right) {
      int comparisons = 0;
      int[] temp = new int[right - left + 1];
      int index1 = left;
      int index2 = middle + 1;
      int index = left;
      while (index1 < middle && index2 < right) {
         comparisons++;
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
