/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * 
 */

package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPairWithGivenSum {

	public static void main(String[] args) {
		
		int[] array = new int[]{3,4,8,1,2,5};
		int x = 12;
		
		sortingApproach(array, x);
		
		usingHashTableApproach(array, x);
		
		
	}
	
	public static void sortingApproach(int[] array, int x) {
		
		Arrays.sort(array);
		
		boolean flag = false;
		int i=0;
		int j=array.length-1;
		
		
		while(i<j) {
			if(array[i]+array[j] == x) {
				System.out.println("("+array[i]+", "+array[j]+")");
				j--;
				flag = true;
			}else if(array[i]+array[j] < x) {
				i++;
			}
			else if(array[i]+array[j] > x) {
				j--;
			}
			
		}
		
		if(!flag) {
			System.out.println("No such a Pair");
		}
	}
	
	public static void usingHashTableApproach(int[] array, int x) {
		
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		for(int i : array) {
			int diff = x - i;
			
			if(hashmap.containsKey(diff))
				System.out.println("("+i+", "+diff+")");
			
			if(hashmap.containsKey(i))
				hashmap.put(i, hashmap.get(i)+1);
			else
				hashmap.put(i, 1);
			
		}
	}

}
