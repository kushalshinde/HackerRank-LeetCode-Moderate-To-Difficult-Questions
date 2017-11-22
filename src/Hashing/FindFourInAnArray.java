/*
 * Find four elements a, b, c and d in an array such that a+b = c+d
 * 
 * Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) such 
 * that a+b = c+d, and a, b, c and d are distinct elements. If there are multiple answers, then print any of them.

   Example:

   Input:   {3, 4, 7, 1, 2, 9, 8}
   Output:  (3, 8) and (4, 7)
   Explanation: 3+8 = 4+7

   Input:   {3, 4, 7, 1, 12, 9};
   Output:  (4, 12) and (7, 9)
   Explanation: 4+12 = 7+9

   Input:  {65, 30, 7, 90, 1, 9, 8};
   Output:  No pairs found
 * 
 */

package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class FindFourInAnArray {

	public static void main(String[] args) {
		
		int[] array = new int[]{65, 30, 7, 90, 1, 9, 8};
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		boolean checksum = false;
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				int key = array[i]+array[j];
				ArrayList<Integer> l1 = new ArrayList<Integer>();
				l1.add(array[i]);
				l1.add(array[j]);
				
				if(map.containsKey(key)) {
					System.out.print("("+array[i]+","+array[j]+")"+" = "+"(");
					checksum=true;
					boolean flag = false;
					for(Integer m : map.get(key)) {
						if(flag==false) {
							System.out.print(m+",");
							flag=true;
						}else
							System.out.print(m+")");
					}
					System.out.println();
				}		
				map.put(key, l1);
			}
		}
		
		if(!checksum)
			System.out.println("No pairs found");
	}

}
