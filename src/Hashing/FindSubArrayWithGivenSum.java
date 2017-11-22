/*
 * Find subarray with given sum
 
Given an unsorted array of integers, find a subarray which adds to a given number. 
If there are more than one subarrays with sum as the given number, print any of them.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {10, 2, -2, -20, 10}, sum = -10
Ouptut: Sum found between indexes 0 to 3

Input: arr[] = {-10, 0, 2, -2, -20, 10}, sum = 20
Ouptut: No subarray with given sum exists
 
 */

package Hashing;

import java.util.HashMap;

public class FindSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[]  array = {-5, 2, 10, 20, 3, 8}; 
		int sum = 33;
		
		int currentsum=0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<array.length; i++) {
			currentsum += array[i];
				
			if(currentsum==sum ) {
				System.out.println("Subarray found: " + 0 + " : "+i);
				return;
			}
			
			if(map.containsKey(currentsum-sum)) {
				System.out.println("Subarray found: " +(map.get(currentsum-sum)+1)+ " : "+i);
				return;
			}
			
			map.put(currentsum, i);
		}
		System.out.println("Not found");
	}
		

}
