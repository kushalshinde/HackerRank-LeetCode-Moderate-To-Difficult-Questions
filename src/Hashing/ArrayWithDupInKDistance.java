/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Check if a given array contains duplicate elements within k distance from each other
 * 
 * 
 * Given an unsorted array that may contain duplicates. Also given a number k which is 
 * smaller than size of array. Write a function that returns true if array contains duplicates 
 * within k distance.

   Examples:

   Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
   Output: false
   All duplicates are more than k distance away.

   Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
   Output: true
   1 is repeated at distance 3.

   Input: k = 3, arr[] = {1, 2, 3, 4, 5}
   Output: false

   Input: k = 3, arr[] = {1, 2, 3, 4, 4}
   Output: true
   
   
 */

package Hashing;

import java.util.HashSet;

public class ArrayWithDupInKDistance {

	public static void main(String[] args) {
	
		int[] array = new int[]{1, 2, 3, 1, 4, 5};
		int k = 3;
	
		System.out.println(checkIfDupWithinKDistance(array, k) ? "YES" : "No");
		
	}
	
	public static boolean checkIfDupWithinKDistance(int[] array, int k) {

		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<array.length; i++) {
			
			if(set.contains(array[i]))
				return true;
			
			set.add(array[i]);
			
			if(i>=k)
				set.remove(array[i-k]);
		}
		return false;
	}
	
	
	

}
