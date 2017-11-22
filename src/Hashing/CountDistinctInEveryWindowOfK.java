/*
 * Count distinct elements in every window of size k
 * 
 * Given an array of size n and an integer k, return the of count of distinct numbers in all windows of size k.
 * 
 * Input:  arr[] = {1, 2, 1, 3, 4, 2, 3};
            k = 4
   Output:
   3
   4
   4
   3

   Explanation:
   First window is {1, 2, 1, 3}, count of distinct numbers is 3
   Second window is {2, 1, 3, 4} count of distinct numbers is 4
   Third window is {1, 3, 4, 2} count of distinct numbers is 4
   Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
 * 
 * 
 */

package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class CountDistinctInEveryWindowOfK {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 1, 3, 4, 2, 3};
        int k = 4;
	
        HashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i=0; i<=array.length-k; i++) {
        	for(int j=i; j<k+i; j++) {
        		System.out.print(array[j]+ " ");
        		set.add(array[j]);
        	}
        	System.out.print("Count of distinct numbers is: "+ set.size());
        	System.out.println();
        	set.clear();
        }
 	}
	

}
