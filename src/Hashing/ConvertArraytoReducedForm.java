/*
 * Convert an array to reduced form
 * 
 * Given an array with n distinct elements, convert the given array to a form where all elements 
 * are in range from 0 to n-1. The order of elements is same, i.e., 0 is placed in place of smallest 
 * element, 1 is placed for second smallest element, … n-1 is placed for largest element.

   Input:  arr[] = {10, 40, 20}
   Output: arr[] = {0, 2, 1}

   Input:  arr[] = {5, 10, 40, 30, 20}
   Output: arr[] = {0, 1, 4, 3, 2}

   Expected time complexity is O(n Log n).
 * 
 */

package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ConvertArraytoReducedForm {

	public static void main(String[] args) {
		
		int[] array = new int[] {5, 10, 40, 30, 20};
		
		int[] temp = new int[array.length];
		
		System.arraycopy(array, 0, temp, 0, array.length);
		
		Arrays.sort(temp);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int m=0;
		for(int i : temp)
			map.put(i, m++);
		
		for(int i : array)
			System.out.print(map.get(i)+ " ");
		
	}

}
