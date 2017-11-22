/*
 * Find number of Employees Under every Employee
 * 
 * Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.
	
   Input
   ========================
   A, C
   B, C
   C, F
   D, E
   E, F
   F, F
	
  Output should be a Dictionary that contains following.

   A - 0  
   B - 0
   C - 2
   D - 0
   E - 1
   F - 5  

  In this example C is manager of A,  C is also manager of B, F is manager of C and so on.
 * 
 */

package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindNoOfEmpUnderEveryEmp {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		HashSet<String> all = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {				
			String input = sc.nextLine();
			
			if(input.isEmpty())
				break;
			
			String[] array = input.split(", ");
			
			
			
			if(array[0].equals(array[1]))
				continue;
			
			if(map.containsKey(array[1])) {
				ArrayList<String> l1 = new ArrayList<String>(map.get(array[1]));
				l1.add(array[0]);
				if(map.containsKey(array[0])) {
					ArrayList<String> l4 = new ArrayList<String>(map.get(array[0]));
					l1.addAll(l4);
				}
					
				map.put(array[1], l1);
			}
			else {
				ArrayList<String> l2 = new ArrayList<String>();
				l2.add(array[0]);
				if(map.containsKey(array[0])) {
					ArrayList<String> l3 = new ArrayList<String>(map.get(array[0]));
					l2.addAll(l3);
				}
				map.put(array[1], l2);
			}
						
			all.add(array[0]);
			all.add(array[1]);
			
		}
		
		int ct=0;
		for(String s : all) {
			if(!map.containsKey(s))
				System.out.println(s + " - 0");
			else {
				ArrayList<String> l5 = new ArrayList<String>(map.get(s));
					System.out.print(s+ " - ");
					for(@SuppressWarnings("unused") String t : l5)
						ct++;
					System.out.print(ct);
					System.out.println();
					ct=0;
			}
				
		}
		
		
		
		/*int count=0;
		for(Map.Entry<String, ArrayList<String>> e : map.entrySet()) {
			System.out.print(e.getKey() + " -> ");
			for(String s : e.getValue())
				count++;
				System.out.print(count);
			System.out.println();
			count=0;
		}
		*/
		sc.close();
	}

}
