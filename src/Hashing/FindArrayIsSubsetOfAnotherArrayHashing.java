/*
 Using HashSet
 
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

import java.util.HashSet;

public class FindArrayIsSubsetOfAnotherArrayHashing {

	public static void main(String[] args) {
		
		int[] array1 = {11, 1, 13, 21, 3, 7};
        int[] array2 = {10, 3, 7, 1};
         
        int m = array1.length;
        int n = array2.length;
             
        if(isSubset(array1, array2, m, n))
        	System.out.println("Subset");
        else
        	System.out.println("Not a subset");
	}
	
	public static boolean isSubset(int[] array1, int[] array2, int m, int n) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<m; i++) {
			if(!set.contains(array1[i]))
				set.add(array1[i]);
		}
		
		for(int j=0; j<n; j++) {
			if(!set.contains(array2[j]))
				return false;
		}
		return true;
		
	}
	

}
