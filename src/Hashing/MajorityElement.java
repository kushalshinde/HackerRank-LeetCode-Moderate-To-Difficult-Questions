/*
 * Majority Element - An element that appears more than n/2 times 
 * 
   I/P : 3 3 4 2 4 4 2 4 4
   O/P : 4 

   I/P : 3 3 4 2 4 4 2 4
   O/P : NONE    
 * 
 */

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
	
		int[] arr = new int[]{3, 3, 4, 2, 4, 4, 2, 4};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
		for(int i : arr){
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i,1);
		}
		
		boolean flag = false;
				
		for(Map.Entry<Integer, Integer> e : map.entrySet()){
			if(e.getValue()> arr.length/2){
				System.out.println(e.getKey());
				flag=true;
			}
		}
		
		if(!flag)
			System.out.println("No Majority element");
	}

}
