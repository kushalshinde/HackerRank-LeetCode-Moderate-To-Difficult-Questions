/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Group multiple occurrence of array elements ordered by first occurrence
 * 
 * 
 * Given an unsorted array with repetitions, the task is to group multiple occurrence of 
 * individual elements. The grouping should happen in a way that the order of first occurrences of all elements is maintained.

   Examples:

   Input: arr[] = {5, 3, 5, 1, 3, 3}
   Output:        {5, 5, 3, 3, 3, 1}

   Input: arr[] = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4}
   Output:        {4, 4, 4, 6, 6, 9, 9, 2, 3, 10}
 * 
 * 
 * 
 */

package Hashing;

import java.util.ArrayList;
import java.util.List;

public class GroupMultiOccOfArrayElementsOrderedByFirstOcc {

	public static void main(String[] args) {
	
		int[] array = new int[] {10, 5, 3, 10, 10, 4, 1, 3};
				
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i : array) {
			if(!list.contains(i))
				list.add(i);
			else 
				list.add(list.indexOf(i)+1, i);
		}
		
		System.out.println(list);
	}

}
