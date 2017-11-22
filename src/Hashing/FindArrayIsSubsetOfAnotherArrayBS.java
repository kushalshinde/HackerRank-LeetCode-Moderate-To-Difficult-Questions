/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * 
 Binary Search approach
 
 Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. 
 Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.

 Examples:
 Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
 Output: arr2[] is a subset of arr1[]

 Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
 Output: arr2[] is a subset of arr1[]

 Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
 Output: arr2[] is not a subset of arr1[]
 
 */

package Hashing;

import java.util.Arrays;

public class FindArrayIsSubsetOfAnotherArrayBS {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int[] array2 = {1, 2, 4};
		
		int m = array1.length;
		int n = array2.length;
		
		if(isSubset(array1, array2, m, n))
			System.out.println("Subset");
		else
			System.out.println("Not a Subset");
	}
	
	public static boolean isSubset(int[] array1, int[] array2, int m, int n) {
		Arrays.sort(array1);
		
		for(int j=0; j<n; j++) {
			if(binarySearch(array1, 0, m-1, array2[j]) == -1)
			return false;
		}
		return true;
	}
	
	public static int binarySearch(int[] array, int low, int high, int x) {
		if(low<=high) {
			int mid = low + (high-low)/2;
			
			if((array[mid] == x))
				return mid;
			else if(x > array[mid])
				 return binarySearch(array, (mid+1), high, x);
			else
				 return binarySearch(array, low, (mid-1), x);
		}
		return -1;
	}

}
