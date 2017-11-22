/*
 * Given an array of positive integers. All numbers occur even number of times except one 
   number which occurs odd number of times. Find the number in O(n) time & constant space.

   Example:
   I/P = [1, 2, 3, 2, 3, 1, 3]
   O/P = 3
 * 
 */

package Hashing;

import java.util.HashMap;

public class NumberOccOddNumberOfTimes {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		System.out.println(oddTimes(arr));
	}
	
	public static int oddTimes(int[] arr){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i < arr.length; i++){
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else{
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
		}

		for(int i = 0;i < arr.length; i++){
			if(map.containsKey(arr[i]) && map.get(arr[i])%2!=0){
				return arr[i];
			}
		}
		
		return -1;
	}

}
