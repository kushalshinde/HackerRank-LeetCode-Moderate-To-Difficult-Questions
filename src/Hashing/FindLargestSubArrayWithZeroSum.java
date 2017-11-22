/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Find the largest subarray with 0 sum
 * 
 * Given an array of integers, find length of the largest subarray with sum equals to 0.

   Examples:

   Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
   Output: 5
   The largest subarray with 0 sum is -2, 2, -8, 1, 7

   Input: arr[] = {1, 2, 3}
   Output: 0
   There is no subarray with 0 sum

   Input: arr[] = {1, 0, 3}
   Output: 1
 * 
 * 
 * 
 */

package Hashing;

import java.util.HashMap;

public class FindLargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		
		int[] array = new int[] {15, -2, 2, -8, 1, 7, 10, 23};
		
		System.out.println(normalApproach(array)==0 ? "No SubArray found" : normalApproach(array));
		
		System.out.println(usingHashing(array)==0 ? "No SubArray found" : usingHashing(array));
		

	}
	
	public static int normalApproach(int[] array) {
		
		int length = 0;
		for(int i=0; i<array.length; i++) {
			int currentsum = 0;
			for(int j=i; j<array.length; j++) {
				currentsum+=array[j];
				
				if(currentsum==0)
					length = Math.max(length, j-i+1);
			}
		}
		return length;
	}
	
	public static int usingHashing(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
        int max_len = 0;
        
        for(int i=0; i<array.length; i++) {
        	sum+=array[i];
        	
        	if(array[i]==0 && max_len==0)
        		max_len=1;
        	
            if (sum == 0)
                max_len = i+1;
            
            Integer prev = map.get(sum);
            
            if(prev!=null)
            	max_len = Math.max(max_len, i-prev);
            else
            	map.put(sum, i);
        }
		
        return max_len;
	}
}
