/*
 * Name - Kushal S Shinde
 * Email - kshinde1@binghamton.edu
 * Date - 27 Nov 2017
 * 
 * Find the minimum element in a sorted and rotated array

   A sorted array is rotated at some unknown point, find the minimum element in it.

   Following solution assumes that all elements are distinct.

   Examples

   Input: {5, 6, 1, 2, 3, 4}
   Output: 1

   Input: {1, 2, 3, 4}
   Output: 1

   Input: {2, 1}
   Output: 1
 */

package Arrays;

public class SortedAndRotatedArray {

	public static void main(String[] args) {
		
		int[] array = {6,7,8,9,1,2,3,4,5};  
		
		int low = 0;
		int high = array.length-1;
	
		System.out.println(binarySearch(array, low, high));

	}
	
	public static int binarySearch(int[] array, int low, int high) {
		if(low==high)
			return array[low];
		
		int mid = low + (high-low)/2;
		
		if(mid < high && array[mid] > array[mid+1])
			return array[mid+1];
		
		if(mid > low && array[mid] < array[mid-1])
			return array[mid];
		
		if(array[high] > array[mid])
			return binarySearch(array, low, mid-1);
		else
			return binarySearch(array, mid+1, high);
		
	}

}
