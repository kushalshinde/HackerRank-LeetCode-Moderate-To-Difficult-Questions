/*
 * Find Itinerary from a given list of tickets
 * 
 * Given a list of tickets, find itinerary in order using the given list.

   Example:

   Input:
   =======================
   Chennai->Banglore
   Bombay->Delhi
   Goa->Chennai
   Delhi->Goa


   Output:
   =======================
   Bombay->Delhi 
   Delhi->Goa
   Goa->Chennai 
   Chennai->Banglore
  
 * 
 */

package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindItineraryFromAListOfTickets {

public static void main(String args[]) { 
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {				
			String input = sc.nextLine();
			
			if(input.isEmpty())
				break;
			
			String[] array = input.split("->");
				
			map.put(array[0], array[1]);
			
			array[0]="";
			array[1]="";
		}

		String start = "";
	
		for(Map.Entry<String, String> e : map.entrySet()) {
			if(!map.containsValue(e.getKey()))
				start = e.getKey();
		}

		String current = map.get(start);
		
		while(current!=null) {
			System.out.println(start +" -> "+ current);
			start = current;
			current = map.get(current);
		}

		sc.close();
	}

}
