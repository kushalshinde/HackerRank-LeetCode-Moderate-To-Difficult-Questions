/*
 * Name: - Kushal S Shinde
 * Date: - 20 January 2018
 * Email: - kshinde1@binghamton.edu
 *
 * Sort an array when two halves are sorted
 * 
 * Given an integer array of which both first half and second half are sorted. 
 * Task is to merge two sorted halves of array into single sorted array. 
 * 
 * Input : A[] = { 2 ,3 , 8 ,-1 ,7 ,10 }
 * Output : -1 , 2 , 3 , 7 , 8 , 10 
 *
 * Input : A[] = {-4 , 6, 9 , -1 , 3 }
 * Output : -4 , -1 , 3 , 6 , 9 
 * 
 * 
 */

package Sorting;

import java.util.Arrays;

public class SortAnArrayWhen2HalvesAreSorted {

	public static void main(String args[]) { 
		int[] array = {2 ,3 , 8 ,-1 ,7 ,10};
		int i = 0;
		int j = array.length/2;
		
		while(i<j && j<=array.length) {
			if(array[i] > array[j]) {
				for(int k = i; k<j; k++) {
					array[j] ^= array[k];
					array[k] ^= array[j];
					array[j] ^= array[k];					
				}
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
