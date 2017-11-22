/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 * Merge two sorted arrays
 */

package Easyutilities;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
			
		int[] array1 = new int[] {1,3,5,7,9};
		int[] array2 = new int[] {2,4,6,8,10};
			

		int[] array3 = new int[array1.length + array2.length];
			
		int j=0;
		int k=0;
			
		for(int i=0; i<array3.length; i++) {
			if(j<array1.length && k<array2.length)
				array3[i] = (array1[j]>array2[k]) ? array2[k++] : array1[j++];
			else if(j==array1.length)
				array3[i] = array2[k++];
			else
				array3[i] = array1[j++];
		}
			
		System.out.println(Arrays.toString(array3));
	}
}
