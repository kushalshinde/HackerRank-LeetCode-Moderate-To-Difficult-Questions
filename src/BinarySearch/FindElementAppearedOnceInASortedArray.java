/*
 * Name: - Kushal S Shinde
 * Date: - 20 January 2018
 * Email: - kshinde1@binghamton.edu
 * 
 * Find the element that appears once in a sorted array
 * 
 * Given a sorted array in which all elements appear twice (one after one) and 
 * one element appears only once. Find that element in O(log n) complexity.
 * 
 * Input:   arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8}
 * Output:  4

 * Input:   arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8}
 * Output:  8
 * 
 * 
 * 
 */

package BinarySearch;

public class FindElementAppearedOnceInASortedArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
		
		binarySearch(arr, 0, arr.length-1);
	}

	public static void binarySearch(int[] arr, int low, int high) {
		if(high<low)
			return;
		if(low == high) {
			System.out.println("The element is: "+ arr[low]);
			return;
		}
		
		int mid = low + (high-low)/2;
		// If mid is even and element next to mid is
		// same as mid, then output element lies on
		// right side, else on left side
		if(mid%2 == 0) {
			if(arr[mid] == arr[mid+1])
				binarySearch(arr, mid+2, high);
			else
				binarySearch(arr, low, mid);
		}
		else if(mid%2 == 1){
			if(arr[mid] == arr[mid-1])
				binarySearch(arr, mid-2, high);
			else
				binarySearch(arr, low, mid-1);
		}
			
		
		
		
		
		
	}
}
